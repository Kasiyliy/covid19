package kz.kasya.app.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Assylkhan
 * on 1.04.2022
 *
 * Service which gloabally shares us instance of mapping tool
 *
 * @project app
 */
public class MapperService {
    public static final ObjectMapper instance = new ObjectMapper();
    static  {
        instance.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
