package br.com.mycompany.taskforge.infrastructure.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import br.com.mycompany.taskforge.domain.entity.task.Task;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a project entity in the database.
 * <p>
 * This entity contains information about a project, including its unique identifier, name, description,
 * and the list of tasks associated with it.
 * </p>
 *
 * <p>The project entity consists of:</p>
 * <ul>
 *     <li>{@code id}: The unique identifier of the project.</li>
 *     <li>{@code projectName}: The name of the project.</li>
 *     <li>{@code projectDescription}: The description of the project.</li>
 *     <li>{@code tasks}: The list of tasks associated with the project.</li>
 * </ul>
 */
@Table("projects")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectEntity {

    /**
     * Unique identifier of the project.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Name of the project.
     */
    private String projectName;

    /**
     * Description of the project.
     */
    private String projectDescription;

    /**
     * List of tasks associated with the project.
     */
    private List<Task> tasks;
}
