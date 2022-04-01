package kz.kasya.app;

import kz.kasya.app.client.StatisticClient;
import kz.kasya.app.model.response.CountryStatisticResponse;
import kz.kasya.app.model.response.VaccinatedStatisticsResponse;

import java.util.Scanner;

/**
 * @author Assylkhan
 * on 1.04.2022
 * @project app
 */
public class App {

    /**
     * Have fun!
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to COVID 19 app\n");
        System.out.print("Please enter your country: ");
        String country = in.nextLine();
        try {
            CountryStatisticResponse generalStatistic = StatisticClient.instance.getCountryGeneralStatistic(country);
            VaccinatedStatisticsResponse vaccinatedPopulationStatistic = StatisticClient.instance
                    .getCountryVaccinatedPopulationStatistic(country);
            System.out.printf("Confirmed: %d\n", generalStatistic.getConfirmed());
            System.out.printf("Recovered: %d\n", generalStatistic.getRecovered());
            System.out.printf("Deaths: %d\n", generalStatistic.getDeaths());
            System.out.printf("Vaccinated level in %% of total population: %f%%\n",
                    (double) vaccinatedPopulationStatistic.getPeopleVaccinated() * 100 / vaccinatedPopulationStatistic.getPopulation());
        } catch (Exception e) {
            System.err.println("Sorry something bad happened: " + e.getLocalizedMessage());
        }
    }
}
