package br.com.mycompany.taskforge.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for managing project entities.
 * This interface extends CrudRepository to provide basic CRUD operations for ProjectEntity.
 */
public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {}
