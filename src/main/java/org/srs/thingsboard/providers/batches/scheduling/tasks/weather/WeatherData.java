package org.srs.thingsboard.providers.batches.scheduling.tasks.weather;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class WeatherData
{
    private String temperatureMinTime;

    private String sunsetTime;

    private String summary;

    private String precipIntensityMaxTime;

    private String temperatureHighError;

    private String temperatureLowTime;

    private String temperatureHighTime;

    private String temperatureLow;

    private String precipIntensity;

    private String precipIntensityMax;

    private String time;

    private String pressureError;

    private String apparentTemperatureMaxTime;

    private String precipIntensityMaxError;

    private String temperatureMaxError;

    private String uvIndex;

    private String apparentTemperatureHighTime;

    private String temperatureHigh;

    private String precipIntensityError;

    private String precipAccumulation;

    private String icon;

    private String apparentTemperatureLowTime;

    private String temperatureMaxTime;

    private String pressure;

    private String cloudCover;

    private String apparentTemperatureMinTime;

    private String temperatureMin;

    private String precipType;

    private String apparentTemperatureLow;

    private String dewPoint;

    private String sunriseTime;

    private String windSpeed;

    private String humidity;

    private String apparentTemperatureMax;

    private String windBearing;

    private String moonPhase;

    private String precipProbability;

    private String apparentTemperatureMin;

    private String uvIndexTime;

    private String temperatureMax;

    private String apparentTemperatureHigh;

   /* public String getTemperatureMinTime ()
    {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime (String temperatureMinTime)
    {
        this.temperatureMinTime = temperatureMinTime;
    }

    public String getSunsetTime ()
    {
        return sunsetTime;
    }

    public void setSunsetTime (String sunsetTime)
    {
        this.sunsetTime = sunsetTime;
    }

    public String getSummary ()
    {
        return summary;
    }

    public void setSummary (String summary)
    {
        this.summary = summary;
    }

    public String getPrecipIntensityMaxTime ()
    {
        return precipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime (String precipIntensityMaxTime)
    {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    public String getTemperatureHighError ()
    {
        return temperatureHighError;
    }

    public void setTemperatureHighError (String temperatureHighError)
    {
        this.temperatureHighError = temperatureHighError;
    }

    public String getTemperatureLowTime ()
    {
        return temperatureLowTime;
    }

    public void setTemperatureLowTime (String temperatureLowTime)
    {
        this.temperatureLowTime = temperatureLowTime;
    }

    public String getTemperatureHighTime ()
    {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime (String temperatureHighTime)
    {
        this.temperatureHighTime = temperatureHighTime;
    }

    public String getTemperatureLow ()
    {
        return temperatureLow;
    }

    public void setTemperatureLow (String temperatureLow)
    {
        this.temperatureLow = temperatureLow;
    }

    public String getPrecipIntensity ()
    {
        return precipIntensity;
    }

    public void setPrecipIntensity (String precipIntensity)
    {
        this.precipIntensity = precipIntensity;
    }

    public String getPrecipIntensityMax ()
    {
        return precipIntensityMax;
    }

    public void setPrecipIntensityMax (String precipIntensityMax)
    {
        this.precipIntensityMax = precipIntensityMax;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getPressureError ()
    {
        return pressureError;
    }

    public void setPressureError (String pressureError)
    {
        this.pressureError = pressureError;
    }

    public String getApparentTemperatureMaxTime ()
    {
        return apparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime (String apparentTemperatureMaxTime)
    {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public String getPrecipIntensityMaxError ()
    {
        return precipIntensityMaxError;
    }

    public void setPrecipIntensityMaxError (String precipIntensityMaxError)
    {
        this.precipIntensityMaxError = precipIntensityMaxError;
    }

    public String getTemperatureMaxError ()
    {
        return temperatureMaxError;
    }

    public void setTemperatureMaxError (String temperatureMaxError)
    {
        this.temperatureMaxError = temperatureMaxError;
    }

    public String getUvIndex ()
    {
        return uvIndex;
    }

    public void setUvIndex (String uvIndex)
    {
        this.uvIndex = uvIndex;
    }

    public String getApparentTemperatureHighTime ()
    {
        return apparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime (String apparentTemperatureHighTime)
    {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public String getTemperatureHigh ()
    {
        return temperatureHigh;
    }

    public void setTemperatureHigh (String temperatureHigh)
    {
        this.temperatureHigh = temperatureHigh;
    }

    public String getPrecipIntensityError ()
    {
        return precipIntensityError;
    }

    public void setPrecipIntensityError (String precipIntensityError)
    {
        this.precipIntensityError = precipIntensityError;
    }

    public String getPrecipAccumulation ()
    {
        return precipAccumulation;
    }

    public void setPrecipAccumulation (String precipAccumulation)
    {
        this.precipAccumulation = precipAccumulation;
    }

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getApparentTemperatureLowTime ()
    {
        return apparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime (String apparentTemperatureLowTime)
    {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public String getTemperatureMaxTime ()
    {
        return temperatureMaxTime;
    }

    public void setTemperatureMaxTime (String temperatureMaxTime)
    {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public String getPressure ()
    {
        return pressure;
    }

    public void setPressure (String pressure)
    {
        this.pressure = pressure;
    }

    public String getCloudCover ()
    {
        return cloudCover;
    }

    public void setCloudCover (String cloudCover)
    {
        this.cloudCover = cloudCover;
    }

    public String getApparentTemperatureMinTime ()
    {
        return apparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime (String apparentTemperatureMinTime)
    {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public String getTemperatureMin ()
    {
        return temperatureMin;
    }

    public void setTemperatureMin (String temperatureMin)
    {
        this.temperatureMin = temperatureMin;
    }

    public String getPrecipType ()
    {
        return precipType;
    }

    public void setPrecipType (String precipType)
    {
        this.precipType = precipType;
    }

    public String getApparentTemperatureLow ()
    {
        return apparentTemperatureLow;
    }

    public void setApparentTemperatureLow (String apparentTemperatureLow)
    {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public String getDewPoint ()
    {
        return dewPoint;
    }

    public void setDewPoint (String dewPoint)
    {
        this.dewPoint = dewPoint;
    }

    public String getSunriseTime ()
    {
        return sunriseTime;
    }

    public void setSunriseTime (String sunriseTime)
    {
        this.sunriseTime = sunriseTime;
    }

    public String getWindSpeed ()
    {
        return windSpeed;
    }

    public void setWindSpeed (String windSpeed)
    {
        this.windSpeed = windSpeed;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getApparentTemperatureMax ()
    {
        return apparentTemperatureMax;
    }

    public void setApparentTemperatureMax (String apparentTemperatureMax)
    {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public String getWindBearing ()
    {
        return windBearing;
    }

    public void setWindBearing (String windBearing)
    {
        this.windBearing = windBearing;
    }

    public String getMoonPhase ()
    {
        return moonPhase;
    }

    public void setMoonPhase (String moonPhase)
    {
        this.moonPhase = moonPhase;
    }

    public String getPrecipProbability ()
    {
        return precipProbability;
    }

    public void setPrecipProbability (String precipProbability)
    {
        this.precipProbability = precipProbability;
    }

    public String getApparentTemperatureMin ()
    {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin (String apparentTemperatureMin)
    {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public String getUvIndexTime ()
    {
        return uvIndexTime;
    }

    public void setUvIndexTime (String uvIndexTime)
    {
        this.uvIndexTime = uvIndexTime;
    }

    public String getTemperatureMax ()
    {
        return temperatureMax;
    }

    public void setTemperatureMax (String temperatureMax)
    {
        this.temperatureMax = temperatureMax;
    }

    public String getApparentTemperatureHigh ()
    {
        return apparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh (String apparentTemperatureHigh)
    {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }
*/

}
