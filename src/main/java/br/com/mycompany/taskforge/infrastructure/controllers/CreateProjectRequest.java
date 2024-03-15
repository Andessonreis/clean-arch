package br.com.mycompany.taskforge.infrastructure.controllers;

import java.util.List;

import br.com.mycompany.taskforge.domain.entity.task.Task;

/**
 * Represents a request to create a new project.
 * <p>
 * This record contains information about the project to be created, including its name, description,
 * and the list of tasks associated with it.
 * </p>
 *
 * <p>The request consists of:</p>
 * <ul>
 *     <li>{@code projectName}: The name of the project.</li>
 *     <li>{@code projectDescription}: The description of the project.</li>
 *     <li>{@code tasks}: The list of tasks associated with the project.</li>
 * </ul>
 *
 */
public record CreateProjectRequest(String projectName, String projectDescription, List<Task> tasks) {}
