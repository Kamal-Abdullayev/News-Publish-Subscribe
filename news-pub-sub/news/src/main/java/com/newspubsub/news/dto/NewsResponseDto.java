package com.newspubsub.news.dto;

import com.newspubsub.news.model.News;

public record NewsResponseDto(
        String title
) {

    public static NewsResponseDto from(News news) {
        return new NewsResponseDto(news.getTitle());
    }
}
