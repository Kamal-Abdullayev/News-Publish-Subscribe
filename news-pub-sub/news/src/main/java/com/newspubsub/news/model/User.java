package com.newspubsub.news.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String surname;
    private String username;
    private String email;
    private boolean isSubscribed;

    @ElementCollection(targetClass = NewsTopicsEnum.class)
    @JoinTable(name = "USER_NEWS_TOPICS", joinColumns = @JoinColumn(name = "USER_SUB"))
    @Column(name = "TOPICS")
    @Enumerated(EnumType.STRING)
    private List<NewsTopicsEnum> newsTopicEnums;

    public User(String name, String surname, String username, String email, boolean isSubscribed, List<NewsTopicsEnum> newsTopicEnums) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.isSubscribed = isSubscribed;
        this.newsTopicEnums = newsTopicEnums;
    }
}
