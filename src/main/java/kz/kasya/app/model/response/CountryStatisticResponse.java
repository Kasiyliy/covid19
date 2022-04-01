package kz.kasya.app.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Assylkhan
 * on 1.04.2022
 * @project app
 */
public class CountryStatisticResponse {
    @JsonProperty("confirmed")
    private long confirmed;
    @JsonProperty("recovered")
    private long recovered;
    @JsonProperty("deaths")
    private long deaths;

    public long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(long confirmed) {
        this.confirmed = confirmed;
    }

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }
}
