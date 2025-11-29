package com.knock_knu.KNOCK_KNU_BE.domain.fortune;

import com.knock_knu.KNOCK_KNU_BE.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Fortune extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String birth;
    private String gender;
    private String mbti;

    private String title;
    private String grandFortune;
    private String loveFortune;
    private String wealthFortune;
    private String studyFortune;
    private int score;
    private String luckyItem;

    public Fortune(
            String name,
            String birth,
            String gender,
            String mbti,
            String title,
            String grandFortune,
            String loveFortune,
            String wealthFortune,
            String studyFortune,
            int score,
            String luckyItem
    ) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.mbti = mbti;
        this.title = title;
        this.grandFortune = grandFortune;
        this.loveFortune = loveFortune;
        this.wealthFortune = wealthFortune;
        this.studyFortune = studyFortune;
        this.score = score;
        this.luckyItem = luckyItem;
    }
}
