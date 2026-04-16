package sample.common.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // これが設定ファイルであることを示すアノテーション
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 全てのパス（/**）に対してインターセプターを有効にする
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**") 
                // ただし、以下のパスはログイン前でも見れるように「除外」する
                .excludePathPatterns(
                    "/",               // TOP画面
                    "/login",          // ログイン画面とログイン処理
                    "/register",       // ユーザー登録画面と登録処理
                    "/css/**",         // CSSファイル
                    "/js/**",          // JavaScriptファイル
                    "/images/**"       // 画像ファイル
                );
    }
}