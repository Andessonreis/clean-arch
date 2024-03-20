package br.com.mycompany.taskforge.application.gateways;

import br.com.mycompany.taskforge.domain.entity.task.Task;

/**
* Gateway interface for interacting with task-related data.
*/
public interface ITaskGateway {

    /**
     * Creates a new task with the provided details.
     *
     * @param task The task to be created.
     * @return The created task.
     */
    Task createTask(Task task);
}
