package org.srs.thingsboard.providers.batches.scheduling.tasks.weather;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

@Data
@JsonAutoDetect
public class WeatherReport {
@JsonIgnore
private String timezone;

    private WeatherFlags flags;

    private String longitude;

    private String latitude;

    private String offset;

    private Forecast daily;

}

