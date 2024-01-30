package com.newspubsub.news.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "News")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;
    @Column(length = 1000)
    private String content;
    @Column(name = "created_time", updatable = false)
    @CreationTimestamp
    private Date createTime;
    @ElementCollection(targetClass = NewsTopicsEnum.class)
    @JoinTable(name = "NEWS_TOPICS", joinColumns = @JoinColumn(name = "NEWS_TOPIC"))
    @Column(name = "TOPICS")
    @Enumerated(EnumType.STRING)
    private List<NewsTopicsEnum> topics;

    public News(String title, String content, List<NewsTopicsEnum> topics) {
        this.title = title;
        this.content = content;
        this.topics = topics;
    }
}
