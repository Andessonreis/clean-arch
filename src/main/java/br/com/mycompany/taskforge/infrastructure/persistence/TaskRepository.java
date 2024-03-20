package br.com.mycompany.taskforge.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskEntity, Long>{
    
}
