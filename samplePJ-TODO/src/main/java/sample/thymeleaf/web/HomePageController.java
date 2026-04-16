package sample.thymeleaf.web; // 自分のプロジェクトに合わせて変更してください

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/") // localhost:8080 にアクセスした時に実行
    public String homePage() {
        // "homePage" という名前のHTMLファイルを返します
        return "homePage";
    }
}