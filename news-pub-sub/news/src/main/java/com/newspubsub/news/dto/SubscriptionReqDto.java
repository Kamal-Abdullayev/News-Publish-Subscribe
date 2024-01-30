package com.newspubsub.news.dto;

import com.newspubsub.news.model.NewsTopicsEnum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record SubscriptionReqDto(
        @NotBlank
        String name,
        @NotBlank
        String surname,
        @Email
        @NotBlank
        String email,
        List<NewsTopicsEnum> newsTopicList
) {
}
