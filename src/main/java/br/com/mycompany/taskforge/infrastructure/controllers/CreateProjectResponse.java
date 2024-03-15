package br.com.mycompany.taskforge.infrastructure.controllers;

import java.util.List;

import br.com.mycompany.taskforge.domain.entity.task.Task;

/**
 * Represents a response for creating a new project.
 * <p>
 * This record contains information about the newly created project, including its name, description,
 * and the list of tasks associated with it.
 * </p>
 *
 * <p>The response consists of:</p>
 * <ul>
 *     <li>{@code projectName}: The name of the project.</li>
 *     <li>{@code projectDescription}: The description of the project.</li>
 *     <li>{@code tasks}: The list of tasks associated with the project.</li>
 * </ul>
 *
 */
public record CreateProjectResponse(String projectName, String projectDescription, List<Task> tasks) {}
