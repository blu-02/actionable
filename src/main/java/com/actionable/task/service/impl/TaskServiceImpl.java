package com.actionable.task.service.impl;

import com.actionable.task.mapper.TaskMapper;
import com.actionable.task.model.dto.Task;
import com.actionable.task.model.repositories.TaskRepository;
import com.actionable.task.service.TaskService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    private final TaskMapper taskMapper;

    @Override
    public Task findTaskById(Long id) {
        return null;
    }
}
