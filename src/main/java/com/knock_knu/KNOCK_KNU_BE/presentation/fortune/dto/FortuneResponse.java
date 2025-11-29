package com.knock_knu.KNOCK_KNU_BE.presentation.fortune.dto;

import com.knock_knu.KNOCK_KNU_BE.domain.fortune.Fortune;

public record FortuneResponse(
        String title,
        String grandFortune,
        String loveFortune,
        String wealthFortune,
        String studyFortune,
        int score,
        String luckyItem
) {
    public static FortuneResponse from(Fortune fortune) {
        return new FortuneResponse(
                fortune.getTitle(),
                fortune.getGrandFortune(),
                fortune.getLoveFortune(),
                fortune.getWealthFortune(),
                fortune.getStudyFortune(),
                fortune.getScore(),
                fortune.getLuckyItem()
        );
    }
}
