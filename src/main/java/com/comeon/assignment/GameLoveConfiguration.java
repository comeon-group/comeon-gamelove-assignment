package com.comeon.assignment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by alberto on 2015-11-11.
 */
public class GameLoveConfiguration extends Configuration {
    @NotEmpty
    @JsonProperty
    private String template;

    @NotEmpty
    @JsonProperty
    private String defaultName = "Comeon!";

    public String getTemplate() {
        return template;
    }

    public String getDefaultName() {
        return defaultName;
    }
}
