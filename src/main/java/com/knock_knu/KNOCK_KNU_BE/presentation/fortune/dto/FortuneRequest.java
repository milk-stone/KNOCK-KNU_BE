package com.knock_knu.KNOCK_KNU_BE.presentation.fortune.dto;

public record FortuneRequest(
        String name,
        String birth,
        String gender,
        String mbti
) {
}
