package br.com.mycompany.taskforge.infrastructure.gateways;

import br.com.mycompany.taskforge.application.gateways.IProjectGateway;
import br.com.mycompany.taskforge.domain.entity.project.Project;
import br.com.mycompany.taskforge.infrastructure.persistence.ProjectEntity;
import br.com.mycompany.taskforge.infrastructure.persistence.ProjectRepository;

/**
 * Implementation of the project gateway.
 */
public class ProjectRepositoryGateways implements IProjectGateway {

    /**
     * Repository for managing project entities.
     */
    private final ProjectRepository projectRepository;

    /**
     * Mapper for converting between project domain objects and entities.
     */
    private final ProjectEntityMapper projectEntityMapper;

    /**
     * Constructor for dependency injection.
     *
     * @param projectRepository   The project repository implementation.
     * @param projectEntityMapper The project entity mapper implementation.
     */
    public ProjectRepositoryGateways(ProjectRepository projectRepository, ProjectEntityMapper projectEntityMapper) {
        this.projectRepository = projectRepository;
        this.projectEntityMapper = projectEntityMapper;
    }

    /**
     * Creates a new project using the provided project domain object.
     *
     * @param projectDomainObject The project domain object to be created.
     * @return The created project.
     */
    @Override
    public Project createProject(Project projectDomainObject) {
        ProjectEntity projectEntity = projectEntityMapper.toEntity(projectDomainObject);
        ProjectEntity savedEntity = projectRepository.save(projectEntity);
        return projectEntityMapper.toDomainObject(savedEntity);
    }
}
