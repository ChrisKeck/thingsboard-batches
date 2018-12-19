package org.srs.thingsboard.providers.batches.scheduling.tasks.weather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.lang.NonNull;
import org.springframework.web.client.RestOperations;
import org.srs.thingsboard.providers.batches.scheduling.tasks.ScheduledTask;

import java.util.List;

@Slf4j public abstract class BaseRestToFileTask<Entity> implements ScheduledTask {

    private final String apiurl;
    private final String targetPath;
    private final RestOperations template;

    protected BaseRestToFileTask(@NonNull String apiurl, @NonNull String targetPath, @NonNull RestOperations template) {
        this.apiurl = apiurl;
        this.targetPath = targetPath;
        this.template = template;
    }

    @Override
    public void execute() {
        List<Entity> datas = callRestApi(apiurl, template);
        if (datas.size() > 0) {
            ItemWriter<Entity> writer = createWriter(targetPath);
            try {
                writer.write(datas);
            } catch (Exception e) {
                log.error("Can not write to path", e);
            }
        }
    }

    protected abstract List<Entity> callRestApi(String apiurl, RestOperations template);

    protected abstract ItemWriter<Entity> createWriter(String path);

}
