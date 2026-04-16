package sample.common.service;

import java.util.List;
import sample.common.dao.entity.Task;

public interface TaskService {
    List<Task> findAllTasks();
    void saveTask(Task task);
    Task findTaskById(Integer id); // 編集用
    void updateTask(Task task);    // 更新用
    void deleteTask(Integer id);   // 削除用
}