package com.actionable.task.service;

import com.actionable.task.model.dto.Task;

public interface TaskService {

    Task findTaskById(Long id);

}
