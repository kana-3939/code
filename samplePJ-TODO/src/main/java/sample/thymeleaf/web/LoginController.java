package sample.thymeleaf.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sample.common.dao.entity.Login;
import sample.common.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

   
    /**
     * ログイン画面を表示する
     */
    @GetMapping("/login")
    public String viewLogin() {
        return "login"; // login.htmlを表示
    }

    /**
     * ログイン実行処理
     */
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, 
                        @RequestParam("password") String password, 
                        HttpSession session, 
                        Model model) {
        
        Login user = loginService.authenticate(username, password);
        
        if (user != null) {
            session.setAttribute("user", user); 
            return "redirect:/tasks"; // 成功したらタスク一覧へ
        } else {
            model.addAttribute("error", "ユーザー名またはパスワードが正しくありません。");
            return "login";
        }
    }

    /**
     * ユーザー登録画面を表示する
     */
    @GetMapping("/register")
    public String viewRegister() {
        return "register"; // register.htmlを表示
    }

    /**
     * ユーザー登録実行処理
     */
    @PostMapping("/register")
    public String register(@RequestParam("username") String username, 
                           @RequestParam("password") String password,
                           Model model) {
        
        // Serviceに登録処理をお願いする
        boolean success = loginService.registerUser(username, password);
        
        if (success) {
            // 登録できたらログイン画面へ。メッセージを出すことも可能です
            return "redirect:/login";
        } else {
            model.addAttribute("error", "そのユーザー名は既に使用されています。");
            return "register";
        }
    }

    /**
     * ログアウト処理
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}