package br.com.mycompany.taskforge.application.usercase;

import br.com.mycompany.taskforge.domain.entity.task.Task;

/**
 * Represents an interactor for creating a project.
 */
public interface ICreateTaskInteractor {

    /**
     * Creates a new Task with the given details.
     *
     * @param Task The Task to be created.
     * @return The created Task.
     */
    Task createTask(Task task);
}