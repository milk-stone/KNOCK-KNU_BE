package com.knock_knu.KNOCK_KNU_BE.presentation.compatibility.dto;

public record CompatibiiltyResponse(
        String title,
        int score,
        String goodPoint,
        String badPoint,
        String advice
) {
}
