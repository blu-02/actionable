package com.actionable.task.model.entity;


import com.actionable.task.model.enums.Priority;
import com.actionable.task.model.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "TASKS")
@Data
public class TaskEntity {

    @Id
    private Long id;

    @Column
    @NotBlank
    private String title;

    @Enumerated(EnumType.STRING)
    private Priority taskPriority;

    @Enumerated(EnumType.STRING)
    private Status taskStatus;

    @Column
    private LocalDateTime dueDate;

    @Column
    private LocalDateTime createdAt;
}
