package br.com.mycompany.taskforge.infrastructure.gateways;

import br.com.mycompany.taskforge.domain.entity.project.Project;
import br.com.mycompany.taskforge.infrastructure.persistence.ProjectEntity;

/**
 * Mapper class responsible for converting between project domain objects and database entities.
 */
public class ProjectEntityMapper {

    /**
     * Converts a project domain object to a project entity.
     *
     * @param projectDomainObject The project domain object to be converted.
     * @return The corresponding project entity.
     */
    public ProjectEntity toEntity(Project projectDomainObject) {
        return new ProjectEntity(
                null,
                projectDomainObject.projectName(),
                projectDomainObject.projectDescription(),
                projectDomainObject.tasks());
    }

    /**
     * Converts a project entity to a project domain object.
     *
     * @param projectEntity The project entity to be converted.
     * @return The corresponding project domain object.
     */
    public Project toDomainObject(ProjectEntity projectEntity) {
        return new Project(
                projectEntity.getProjectName(),
                projectEntity.getProjectDescription(),
                projectEntity.getTasks());
    }
}
