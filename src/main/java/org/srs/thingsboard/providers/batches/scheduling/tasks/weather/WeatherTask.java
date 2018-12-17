package org.srs.thingsboard.providers.batches.scheduling.tasks.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.json.JacksonJsonObjectMarshaller;
import org.springframework.batch.item.json.JsonFileItemWriter;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.srs.thingsboard.providers.batches.scheduling.tasks.ScheduledTask;

import javax.xml.ws.Response;
import java.util.List;

@Slf4j
public class WeatherTask implements ScheduledTask {

    private static final String OUTPUT_FILE_DIRECTORY = "build/";
    private final String apiurl;
    private final String targetPath;
    private final RestOperations template;

    public WeatherTask(String apiurl,
                       String targetPath,
                       RestOperations template) {
        this.apiurl = apiurl;
        this.targetPath = targetPath;
        this.template = template;
    }

    @Override
    public void execute() {
        List<WeatherData>  datas = callRestApi(apiurl,
                                               template);
        if (datas.size()>0) {
            ItemWriter<WeatherData> writer = createWriter(targetPath);
            try {
                writer.write(datas);
            } catch (Exception e) {
                log.error("Can not write to path", e );
            }
        }
    }

    private ItemWriter<WeatherData> createWriter(String path) {
        JsonFileItemWriter<WeatherData> writer = new JsonFileItemWriter<>(new FileSystemResource(
                path), new JacksonJsonObjectMarshaller<>());
        writer.setAppendAllowed(true);
        return writer;
    }

    private List<WeatherData>  callRestApi(String apiurl,
                                           RestOperations template) {
        log.info("Calling weatherforecast-service at {}",apiurl);
        WeatherReport response=template.getForObject(apiurl,
                                                     WeatherReport.class);
        log.info("response is from weatherforecast-service: {}",response);
        List<WeatherData> datas=response.getDaily().getData();
        return datas;
    }

}
