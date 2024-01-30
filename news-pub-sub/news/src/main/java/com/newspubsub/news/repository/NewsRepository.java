package com.newspubsub.news.repository;

import com.newspubsub.news.model.News;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface NewsRepository extends JpaRepository<News, String> {
    List<News> findAllByTitleContainingIgnoreCase(String title, Pageable pageable);
    @Query("select n.id from News n where n.createTime >= :threeHoursAgoDate")
    List<String> findAllWithDateAfter(@Param("threeHoursAgoDate") LocalDateTime threeHoursAgoDate);
}
