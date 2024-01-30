package com.newspubsub.news.repository;

import com.newspubsub.news.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface NewsSubscriptionRepository extends JpaRepository<User, String> {
    Optional<User> findUserByEmail(String email);
}
