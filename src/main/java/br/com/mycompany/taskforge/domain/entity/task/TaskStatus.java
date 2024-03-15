package br.com.mycompany.taskforge.domain.entity.task;

/**
 * Represents the status of a task.
 * 
 * <p>
 * This enumeration represents the possible statuses that a task can have:
 * <ul>
 *   <li>{@code TODO}: Indicates that the task is to be done.</li>
 *   <li>{@code IN_PROGRESS}: Indicates that the task is currently in progress.</li>
 *   <li>{@code DONE}: Indicates that the task has been completed.</li>
 * </ul>
 * </p>
 */
public enum TaskStatus {
    /**
     * Indicates that the task is to be done.
     */
    TODO,
    /**
     * Indicates that the task is currently in progress.
     */
    IN_PROGRESS,
    /**
     * Indicates that the task has been completed.
     */
    DONE
}
