package sample.common.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.common.dao.entity.Task;
import sample.common.dao.mapper.TaskMapper;
import sample.common.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> findAllTasks() {
        return taskMapper.findAll();
    }

    @Override
    public void saveTask(Task task) {
        taskMapper.insert(task);
    }

    @Override
    public Task findTaskById(Integer id) {
        // まだMapperにfindByIdがない場合は作る必要があります
        return taskMapper.findById(id);
    }

    @Override
    public void updateTask(Task task) {
        taskMapper.update(task);
    }

    @Override
    public void deleteTask(Integer id) {
        taskMapper.delete(id);
    }
}