package br.com.mycompany.taskforge.domain.entity.project;

import java.util.List;

import br.com.mycompany.taskforge.domain.entity.task.Task;

/**
 * Represents a project entity in the application.
 * <p>
 * This record contains information about a project, including its unique identifier, name, description,
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
 *
 */
public record Project( String projectName, String projectDescription, List<Task> tasks) {}
