package kz.kasya.app.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Assylkhan
 * on 1.04.2022
 * @project app
 */
public class Wrapper<T> {
    @JsonProperty("All")
    private T all;

    public T getAll() {
        return all;
    }

    public void setAll(T all) {
        this.all = all;
    }
}
