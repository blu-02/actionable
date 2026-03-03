package com.actionable.task.mapper;

import com.actionable.task.model.dto.Task;
import com.actionable.task.model.entity.TaskEntity;
import org.mapstruct.Mapper;

@Mapper
public abstract class TaskMapper {

    public abstract Task mapTaskFromEntity(TaskEntity taskEntity);

}
