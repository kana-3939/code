
package sample.common.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import sample.common.dao.entity.Task; // ← これが抜けていると「Task」という型が分からないと言われます

@Mapper
public interface TaskMapper {
    // 戻り値の型は TaskMapper ではなく List<Task> です！
    List<Task> findAll();
    /** データをインサートする */
    void insert(Task task);
    
    /** IDで1件検索する */
    Task findById(Integer id);

    /** データを更新する */
    void update(Task task);

    /** データを削除する */
    void delete(Integer id);
}