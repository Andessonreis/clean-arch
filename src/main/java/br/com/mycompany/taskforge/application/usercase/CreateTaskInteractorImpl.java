package br.com.mycompany.taskforge.application.usercase;

import br.com.mycompany.taskforge.application.gateways.ITaskGateway;
import br.com.mycompany.taskforge.domain.entity.task.Task;

/**
 * Implementation of the interactor for creating a task.
 */
public class CreateTaskInteractorImpl implements ICreateTaskInteractor {

    /**
     * Gateway for interacting with the task repository.
     */
    public final ITaskGateway taskGateway;

    /**
     * Constructor for dependency injection.
     *
     * @param taskGateway The task gateway implementation.
     */
    public CreateTaskInteractorImpl(ITaskGateway taskGateway) {
        this.taskGateway = taskGateway;
    }

    /**
     * Creates a new task with the given details.
     *
     * @param task The task to be created.
     * @return The created task.
     */
    @Override
    public Task createTask(Task task) {
        return taskGateway.createTask(task);
    }
}