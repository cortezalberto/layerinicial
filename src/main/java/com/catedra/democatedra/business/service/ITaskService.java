package com.catedra.democatedra.business.service;


import com.catedra.democatedra.domain.entity.Task;

import java.util.List;

public interface ITaskService {

    Task create(Task request);
    Task getById(Long id);
    List<Task> getAll();
    void deleteById(Long id);
    Task update(Task request);
    List<Task> getByIds(List<Long> tasksIds);
}
