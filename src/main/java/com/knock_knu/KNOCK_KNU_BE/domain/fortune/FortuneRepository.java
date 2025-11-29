package com.knock_knu.KNOCK_KNU_BE.domain.fortune;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface FortuneRepository extends JpaRepository<Fortune, Integer> {
    Optional<Fortune> findByNameAndBirthAndGenderAndMbtiAndCreatedAtBetween(
            String name,
            String birth,
            String gender,
            String mbti,
            LocalDateTime start,
            LocalDateTime end
    );
}
