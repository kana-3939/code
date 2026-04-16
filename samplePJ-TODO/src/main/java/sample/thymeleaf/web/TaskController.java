package sample.thymeleaf.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession; // セッションを使うために必要
import sample.common.dao.entity.Login;
import sample.common.dao.entity.Task;
import sample.common.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    /** タスク一覧表示 */
    @GetMapping
    public String list(Model model) {
        List<Task> tasks = taskService.findAllTasks();
        model.addAttribute("taskList", tasks);
        return "tasks/list";
    }

    /** 新規登録画面の表示 */
    @GetMapping("/new")
    public String formNew(Model model) {
        model.addAttribute("task", new Task());
        return "tasks/form-new";
    }

    /** タスクの保存処理 (新規作成) */
    @PostMapping("/save")
    public String save(@ModelAttribute Task task, HttpSession session) {
        // セッションからログインユーザー情報を取得
        Login loginUser = (Login) session.getAttribute("user");
        
        if (loginUser == null) {
            return "redirect:/login"; // ログインしてなければログイン画面へ
        }
        
        // ログイン中のユーザー名をセット
        task.setUsername(loginUser.getUsername());
        
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    /** 編集画面の表示 */
    @GetMapping("/edit/{id}")
    public String formEdit(@PathVariable("id") Integer id, Model model) {
        Task task = taskService.findTaskById(id);
        model.addAttribute("task", task);
        return "tasks/form-edit";
    }

    /** 更新処理 */
    @PostMapping("/update")
    public String update(@ModelAttribute Task task, HttpSession session) {
        // セッションからログインユーザー情報を取得
        Login loginUser = (Login) session.getAttribute("user");
        
        if (loginUser == null) {
            return "redirect:/login";
        }
        
        // 更新時も username をセット（DBの非NULL制約エラーを防ぐため）
        task.setUsername(loginUser.getUsername());
        
        taskService.updateTask(task);
        return "redirect:/tasks";
    }

    /** 削除処理 */
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}