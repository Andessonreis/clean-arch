package br.com.mycompany.taskforge.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.mycompany.taskforge.application.gateways.IProjectGateway;
import br.com.mycompany.taskforge.application.usercase.CreateProjectInteractorImpl;
import br.com.mycompany.taskforge.infrastructure.controllers.ProjectDTOMapper;
import br.com.mycompany.taskforge.infrastructure.gateways.ProjectEntityMapper;
import br.com.mycompany.taskforge.infrastructure.gateways.ProjectRepositoryGateways;
import br.com.mycompany.taskforge.infrastructure.persistence.ProjectRepository;

/**
 * Configuration class for defining Spring beans related to project management.
 */
@Configuration
public class ProjectConfig {

    /**
     * Defines a bean for the create project interactor implementation.
     *
     * @param projectGateway The project gateway implementation.
     * @return The create project interactor implementation.
     */
    @Bean
    public CreateProjectInteractorImpl createProjectInteractor(IProjectGateway projectGateway) {
        return new CreateProjectInteractorImpl(projectGateway);
    }

    /**
     * Defines a bean for the project gateway.
     *
     * @param projectRepository   The project repository implementation.
     * @param projectEntityMapper The project entity mapper implementation.
     * @return The project gateway implementation.
     */
    @Bean
    public IProjectGateway projectGateway(ProjectRepository projectRepository, ProjectEntityMapper projectEntityMapper) {
        return new ProjectRepositoryGateways(projectRepository, projectEntityMapper);
    }

    /**
     * Defines a bean for the project entity mapper.
     *
     * @return The project entity mapper implementation.
     */
    @Bean
    public ProjectEntityMapper projectEntityMapper() {
        return new ProjectEntityMapper();
    }

    /**
     * Defines a bean for the project DTO mapper.
     *
     * @return The project DTO mapper implementation.
     */
    @Bean
    public ProjectDTOMapper projectDTOMapper() {
        return new ProjectDTOMapper();
    }
}
