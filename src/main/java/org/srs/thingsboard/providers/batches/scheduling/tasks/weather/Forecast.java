package org.srs.thingsboard.providers.batches.scheduling.tasks.weather;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonAutoDetect
public class Forecast
{
    private List<WeatherData> data=new ArrayList<>();
}
