package br.com.mycompany.taskforge.domain.entity.task;

import java.time.LocalDate;

/**
 * Represents a task entity in the application.
 * <p>
 * This record contains information about a task, including its unique identifier, title, description,
 * status, and due date.
 * </p>
 *
 * <p>The task entity consists of:</p>
 * <ul>
 *     <li>{@code id}: The unique identifier of the task.</li>
 *     <li>{@code title}: The title of the task.</li>
 *     <li>{@code description}: The description of the task.</li>
 *     <li>{@code status}: The status of the task.</li>
 *     <li>{@code dueDate}: The due date of the task.</li>
 * </ul>
 * 
 */
public record Task(Long id, String title, String description, TaskStatus status, LocalDate dueDate) {}
