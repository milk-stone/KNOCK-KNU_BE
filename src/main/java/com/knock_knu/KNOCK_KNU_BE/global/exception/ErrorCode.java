package com.knock_knu.KNOCK_KNU_BE.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    WRONG_DOOR_NAME(HttpStatus.BAD_REQUEST, "SE_001", "잘못된 문 이름입니다."),
    WRONG_MODIFIER_NAME(HttpStatus.BAD_REQUEST, "SE_002", "존재하지 않는 수식어입니다."),
    WRONG_PLACE_NAME(HttpStatus.BAD_REQUEST, "SE_003", "존재하지 않는 장소 카테고리입니다."),
    STORE_NOT_FOUND(HttpStatus.NOT_FOUND, "SE_004", "해당 ID의 가게가 존재하지 않습니다."),

    FORTUNE_NOT_FOUND(HttpStatus.NOT_FOUND, "FE_001", "해당 운세가 존재하지 않습니다."),

    GEMINI_API_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "GE_001", "Gemini API 호출 중 오류가 발생했습니다."),
    FORTUNE_PARSING_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "GE_002", "운세 데이터 변환에 실패했습니다.");
    private final HttpStatus status;
    private final String code;
    private final String message;
}
