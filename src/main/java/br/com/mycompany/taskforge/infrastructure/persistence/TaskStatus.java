package br.com.mycompany.taskforge.infrastructure.persistence;

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
