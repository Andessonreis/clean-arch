package br.com.mycompany.taskforge.infrastructure.gateways;

import br.com.mycompany.taskforge.application.gateways.ITaskGateway;
import br.com.mycompany.taskforge.domain.entity.task.Task;
import br.com.mycompany.taskforge.infrastructure.persistence.TaskEntity;
import br.com.mycompany.taskforge.infrastructure.persistence.TaskRepository;

public class TaskRepositoryGateways implements ITaskGateway{

    public final TaskRepository taskRepository;
    
    public final TaskEntityMapper taskEntityMapper;

    public TaskRepositoryGateways(TaskRepository taskRepository, TaskEntityMapper taskEntityMapper) {
        this.taskRepository = taskRepository;
        this.taskEntityMapper = taskEntityMapper;
    }


    @Override
    public Task createTask(Task task) {
        TaskEntity taskEntity = taskEntityMapper.toEntity(task);
        TaskEntity saveTaskEntity = taskRepository.save(taskEntity);
        return taskEntityMapper.toDomainObject(saveTaskEntity);
    }
    
}
