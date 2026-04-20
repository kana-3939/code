package sample.common.dao.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * タスク情報を保持するEntityクラス
 * DB設計書のtasksテーブルに対応
 */
public class Task {

    private Long id;              // ToDoのID
    private String username;      // user名
    private String title;         // タイトル
    private String content;       // 内容
    private String name;          // 登録者名
    private LocalDate startDate;  // 開始日 (DATE型はLocalDate)
    private LocalDate endDate;    // 終了日 (DATE型はLocalDate)
    private LocalDateTime createdAt; // 作成日時 (TIMESTAMP型はLocalDateTime)
    private LocalDateTime updatedAt; // 更新日時 (TIMESTAMP型はLocalDateTime)

    // --- 以下、GetterとSetter ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}