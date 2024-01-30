package com.newspubsub.news.model;

import lombok.Getter;

@Getter
public enum NewsTopicsEnum {
    ALL,
    LOCAL,
    WORLD,
    ECONOMY,
    POLITIC,
    SPORT,
    TRAVEL,
    HEALTH;

    private String topic;


}
