package kz.kasya.app.client;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author Assylkhan
 * on 1.04.2022
 * @project app
 */
class ApiClientTest {

    @Test
    @DisplayName("Actual request to get general statistics")
    public void testGetGeneralRequest() throws IOException {
        assertDoesNotThrow(() -> StatisticClient.instance.getCountryGeneralStatistic("Kazakhstan"));
    }

    @Test
    @DisplayName("Actual request to get vaccination statistics")
    public void testGetVaccinatedRequest() throws IOException {
        assertDoesNotThrow(() -> StatisticClient.instance.getCountryVaccinatedPopulationStatistic("Kazakhstan"));
    }
}