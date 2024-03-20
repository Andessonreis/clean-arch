package br.com.mycompany.taskforge.infrastructure.gateways;

import br.com.mycompany.taskforge.domain.entity.task.Task;
import br.com.mycompany.taskforge.infrastructure.persistence.TaskEntity;

public class TaskEntityMapper {
    
    public TaskEntity toEntity(Task taskDomainObject){

        return new TaskEntity(
            taskDomainObject.id(), 
            taskDomainObject.title(),
            taskDomainObject.description(), 
            taskDomainObject.status());
    }
}
