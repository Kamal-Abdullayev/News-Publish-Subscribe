package com.newspubsub.news.dto;

import com.newspubsub.news.model.NewsTopicsEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record NewsCreateDto(
        @NotBlank
        String title,
        @NotBlank
        String content,
        @NotEmpty
        List<NewsTopicsEnum> topic
) {

}
