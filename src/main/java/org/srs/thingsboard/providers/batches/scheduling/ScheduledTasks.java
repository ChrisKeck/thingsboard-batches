package org.srs.thingsboard.providers.batches.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.srs.thingsboard.providers.batches.scheduling.tasks.ScheduledTask;
import org.srs.thingsboard.providers.batches.scheduling.tasks.weather.WeatherTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
@Component @Slf4j public class ScheduledTasks {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired private Environment environment;
    @Autowired private RestTemplate restTemplate;

    //@Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate() {
        log.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }

    //@Scheduled(fixedDelay = 2000)
    public void scheduleTaskWithFixedDelay() {
        log.info("Fixed Delay Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            log.error("Ran into an error {}", ex);
            throw new IllegalStateException(ex);
        }
    }

    @Scheduled(fixedRate = 2000, initialDelay = 5000)
    public void scheduleTaskWithInitialDelay() {
        var task = createWeatherTask();
        task.execute();
    }

    private ScheduledTask createWeatherTask() {
        return new WeatherTask(environment.getProperty("api.weather.url"),
                               environment.getProperty("api.weather.target.path"),
                               restTemplate);
    }

    //@Scheduled(cron = "0 * * * * ?")
    public void scheduleTaskWithCronExpression() {
        log.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }

}
