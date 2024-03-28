package br.com.mycompany.taskforge.infrastructure.persistence;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a task entity in the database.
 * <p>
 * This entity contains information about a task, including its unique identifier, title, description,
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
 */
@Table("tasks")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskEntity {
    /**
     * Unique identifier of the task.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Title of the task.
     */
    private String title;
    
    /**
     * Description of the task.
     */
    private String description;
    
    /**
     * Status of the task.
     */
    private TaskStatus status;
    
    /**
     * Due date of the task.
     */
    private LocalDate dueDate;
}
