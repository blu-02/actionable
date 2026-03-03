package com.actionable.task.model.dto;

import com.actionable.task.model.enums.Priority;
import com.actionable.task.model.enums.Status;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Task {

    private Long id;

    private String title;

    private Priority taskPriority;

    private Status taskStatus;

    private LocalDateTime dueDate;

    private LocalDateTime createdAt;
}
