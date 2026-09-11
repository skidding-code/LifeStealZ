package com.zetaplugins.lifestealz.util;

import io.papermc.paper.threadedregions.scheduler.ScheduledTask;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Manages all running async tasks
 */
public final class AsyncTaskManager {
    private final List<ScheduledTask> runningTasks = new CopyOnWriteArrayList<>();

    /**
     * Add a task to the list of running tasks
     * @param task The task to add
     */
    public void addTask(ScheduledTask task) {
        runningTasks.add(task);
    }

    /**
     * Cancel all running tasks
     */
    public void cancelAllTasks() {
        for (ScheduledTask task : runningTasks) {
            if (task.isCancelled()) continue;
            task.cancel();
        }
        runningTasks.clear();
    }
}
