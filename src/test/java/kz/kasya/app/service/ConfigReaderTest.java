package kz.kasya.app.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Assylkhan
 * on 1.04.2022
 * @project app
 */
public class ConfigReaderTest {

    @Test
    @DisplayName("Get api base endpoint")
    public void testGetApiBase() {
        assertNotNull(ConfigReaderService.instance.getApiBase());
    }
}