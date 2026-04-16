package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // これが「ここからアプリを始めるよ！」という合言葉
public class Main {

    public static void main(String[] args) {
        // この1行でSpring Bootの全ての機能が動き出します
        SpringApplication.run(Main.class, args);
    }
}