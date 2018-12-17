package org.srs.thingsboard.providers.batches.scheduling.tasks.weather;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonAutoDetect
public class WeatherFlags
{
    @JsonProperty("nearest-station")
    private String neareststation;

    private String units;

    private String[] sources;


}
