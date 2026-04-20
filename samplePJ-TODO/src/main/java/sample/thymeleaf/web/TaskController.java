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

import jakarta.servlet.http.HttpSession;
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
    public String save(@ModelAttribute Task task, Model model, HttpSession session) {
        // 1. バリデーション実行
        if (hasErrors(task, model)) {
            return "tasks/form-new"; // エラーがあれば入力画面に戻る
        }

        // 2. ログインチェックと保存
        Login loginUser = (Login) session.getAttribute("user");
        if (loginUser == null) return "redirect:/login";

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
    public String update(@ModelAttribute Task task, Model model, HttpSession session) {
        // 1. バリデーション実行
        if (hasErrors(task, model)) {
            return "tasks/form-edit"; // エラーがあれば編集画面に戻る
        }

        // 2. ログインチェックと更新
        Login loginUser = (Login) session.getAttribute("user");
        if (loginUser == null) return "redirect:/login";

        task.setUsername(loginUser.getUsername());
        taskService.updateTask(task);
        return "redirect:/tasks";
    }

    /** 削除処理 */
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }

    /**
     * 【共通バリデーションメソッド】
     * アノテーションを使わずに手動でチェックします
     */
    private boolean hasErrors(Task task, Model model) {
        boolean error = false;

        // タイトルチェック
        if (task.getTitle() == null || task.getTitle().isBlank()) {
            model.addAttribute("err_title", "タイトルを入力してください");
            error = true;
        } else if (task.getTitle().length() > 50) {
            model.addAttribute("err_title", "タイトルは50文字以内で入力してください");
            error = true;
        }

        // 内容チェック
        if (task.getContent() == null || task.getContent().isBlank()) {
            model.addAttribute("err_content", "内容を入力してください");
            error = true;
        }

        // 登録者名チェック
        if (task.getName() == null || task.getName().isBlank()) {
            model.addAttribute("err_name", "登録者名を入力してください");
            error = true;
        }

        // 日付チェック
        if (task.getStartDate() == null) {
            model.addAttribute("err_startDate", "開始日を入力してください");
            error = true;
        }
        if (task.getEndDate() == null) {
            model.addAttribute("err_endDate", "終了日を入力してください");
            error = true;
        }

        return error;
    }
}