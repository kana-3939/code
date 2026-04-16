package sample.common.logic;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // セッションを取得（ログイン情報の保管場所）
        HttpSession session = request.getSession();
        
        // セッションに "user" という名前のデータが入っているかチェック
        if (session.getAttribute("user") != null) {
            // ログイン済みなら、そのまま処理を続行（Controllerへ）
            return true;
        }

        // ログインしていなければ、ログイン画面へ強制リダイレクト
        response.sendRedirect(request.getContextPath() + "/login");
        return false;
    }
}