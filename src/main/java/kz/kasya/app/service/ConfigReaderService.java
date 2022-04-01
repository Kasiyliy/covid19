package kz.kasya.app.service;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Assylkhan
 * on 1.04.2022
 *
 * Service to load config from class path
 *
 * @project app
 */
public class ConfigReaderService {

    public static final ConfigReaderService instance;
    private static final Properties prop;

    private ConfigReaderService() {
    }


    static {
        prop = new Properties();
        instance = new ConfigReaderService();
        load();
    }

    /**
     * Method which loads data from config.properties file into local properties object
     * Runs automatically once app started
     * No need to call manually
     */
    private static void load() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream stream = loader.getResourceAsStream("config.properties")) {
            prop.load(stream);
        } catch (Exception e) {
            throw new RuntimeException("Please consider fixing properties file");
        }
    }

    /**
     * Gets config property from class path
     * @return String
     */
    public String getApiBase() {
        return prop.getProperty("API_BASE");
    }
}
