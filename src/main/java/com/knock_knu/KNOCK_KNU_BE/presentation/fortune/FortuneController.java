package com.knock_knu.KNOCK_KNU_BE.presentation.fortune;

import com.knock_knu.KNOCK_KNU_BE.application.fortune.FortuneService;
import com.knock_knu.KNOCK_KNU_BE.presentation.fortune.dto.FortuneRequest;
import com.knock_knu.KNOCK_KNU_BE.presentation.fortune.dto.FortuneResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class FortuneController {
    private final FortuneService fortuneService;

    @PostMapping("/luck")
    public ResponseEntity<FortuneResponse> getFortune(@RequestBody FortuneRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(fortuneService.getTodayFortune(request));
    }
}
