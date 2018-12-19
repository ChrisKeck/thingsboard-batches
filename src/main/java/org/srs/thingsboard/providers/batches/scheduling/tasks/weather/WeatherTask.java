package org.srs.thingsboard.providers.batches.scheduling.tasks.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.json.JacksonJsonObjectMarshaller;
import org.springframework.batch.item.json.JsonFileItemWriter;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.client.RestOperations;

import java.util.List;

@Slf4j public class WeatherTask extends BaseRestToFileTask<WeatherData> {


    public WeatherTask(String apiurl, String targetPath, RestOperations template) {
        super(apiurl, targetPath, template);
    }

    @Override
    protected List<WeatherData> callRestApi(String apiurl, RestOperations template) {
        log.info("Calling weatherforecast-service at {}", apiurl);
        WeatherReport response = template.getForObject(apiurl, WeatherReport.class);
        log.info("response is from weatherforecast-service: {}", response);
        return response.getDaily().getData();
    }

    @Override
    protected ItemWriter<WeatherData> createWriter(String path) {
        JsonFileItemWriter<WeatherData> writer = new JsonFileItemWriter<>(new FileSystemResource(path),
                                                                          new JacksonJsonObjectMarshaller<>());
        writer.setAppendAllowed(true);
        return writer;
    }

}
