package br.com.mycompany.taskforge.infrastructure.persistence;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table("task")
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class TaskEntity {
    @Id
    private Long id;
    
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;

    public TaskEntity(Long id, String title, String description, TaskStatus status, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }
    
}
