package kz.kasya.app.client;

import com.fasterxml.jackson.core.type.TypeReference;
import kz.kasya.app.model.response.CountryStatisticResponse;
import kz.kasya.app.model.response.VaccinatedStatisticsResponse;
import kz.kasya.app.model.response.Wrapper;

import java.io.IOException;
import java.util.HashMap;

import static kz.kasya.app.service.ApiClientService.get;

/**
 * @author Assylkhan
 * on 1.04.2022
 *
 * API consumer client
 * refers to link https://github.com/M-Media-Group/Covid-19-API
 *
 * @project app
 */
public class StatisticClient {
    private StatisticClient() {
    }

    public static final StatisticClient instance = new StatisticClient();

    /**
     * Method to get general statistic information from remote service
     *
     * Throws an exception if fails
     */
    public CountryStatisticResponse getCountryGeneralStatistic(String country) throws IOException {
        return get("/cases", new HashMap<String, String>() {{
            put("country", country);
        }}, new TypeReference<Wrapper<CountryStatisticResponse>>() {
        }).getAll();
    }

    /**
     * Method to get whole vaccination information
     *
     * Throws an exception if fails
     */
    public VaccinatedStatisticsResponse getCountryVaccinatedPopulationStatistic(String country) throws IOException {
        return get("/vaccines", new HashMap<String, String>() {{
            put("country", country);
        }}, new TypeReference<Wrapper<VaccinatedStatisticsResponse>>() {
        }).getAll();
    }

}
