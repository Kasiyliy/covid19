package kz.kasya.app.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VaccinatedStatisticsResponse {
    @JsonProperty("administered")
    private long administered;
    @JsonProperty("people_vaccinated")
    private long peopleVaccinated;
    @JsonProperty("people_partially_vaccinated")
    private long peoplePartiallyVaccinated;
    @JsonProperty("population")
    private long population;

    public long getAdministered() {
        return administered;
    }

    public void setAdministered(long administered) {
        this.administered = administered;
    }

    public long getPeopleVaccinated() {
        return peopleVaccinated;
    }

    public void setPeopleVaccinated(long peopleVaccinated) {
        this.peopleVaccinated = peopleVaccinated;
    }

    public long getPeoplePartiallyVaccinated() {
        return peoplePartiallyVaccinated;
    }

    public void setPeoplePartiallyVaccinated(long peoplePartiallyVaccinated) {
        this.peoplePartiallyVaccinated = peoplePartiallyVaccinated;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
