package com.catedra.democatedra.business.service;

import com.catedra.democatedra.domain.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskGetRequirementTimeToDoService {

    public int execute(List<Task> currentTasks, List<Task> tasksToDo) {

        var timeInCurrentTasks = currentTasks.stream()
                .mapToInt(Task::getTimeRequiredToComplete)
                .sum();

        var timeInTasksToDo = tasksToDo.stream()
                .mapToInt(Task::getTimeRequiredToComplete)
                .sum();

        return timeInCurrentTasks + timeInTasksToDo;
    }

}
