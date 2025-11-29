package com.knock_knu.KNOCK_KNU_BE.application.fortune;

import com.knock_knu.KNOCK_KNU_BE.application.gemini.GeminiService;
import com.knock_knu.KNOCK_KNU_BE.domain.fortune.Fortune;
import com.knock_knu.KNOCK_KNU_BE.domain.fortune.FortuneRepository;
import com.knock_knu.KNOCK_KNU_BE.presentation.fortune.dto.FortuneRequest;
import com.knock_knu.KNOCK_KNU_BE.presentation.fortune.dto.FortuneResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FortuneService {
    private final FortuneRepository fortuneRepository;
    private final GeminiService geminiService;

    public void save(FortuneRequest request, FortuneResponse fortuneData) {
        Fortune fortune = new Fortune(
                request.name(),
                request.birth(),
                request.gender(),
                request.mbti(),
                fortuneData.title(),
                fortuneData.grandFortune(),
                fortuneData.loveFortune(),
                fortuneData.wealthFortune(),
                fortuneData.studyFortune(),
                fortuneData.score(),
                fortuneData.luckyItem()
        );
        fortuneRepository.save(fortune);
    }

    public FortuneResponse getTodayFortune(FortuneRequest request) {
        LocalDateTime startOfDay = LocalDate.now().atStartOfDay();
        LocalDateTime endOfDay = LocalDate.now().atTime(LocalTime.MAX);

        Optional<Fortune> fortune = fortuneRepository.findByNameAndBirthAndGenderAndMbtiAndCreatedAtBetween(
                request.name(),
                request.birth(),
                request.gender(),
                request.mbti(),
                startOfDay,
                endOfDay
        );

        if (fortune.isPresent()) {
            return FortuneResponse.from(fortune.get());
        }

        FortuneResponse fortuneData = geminiService.getTodayFortune(request);

        save(request, fortuneData);
        return fortuneData;
    }
}
