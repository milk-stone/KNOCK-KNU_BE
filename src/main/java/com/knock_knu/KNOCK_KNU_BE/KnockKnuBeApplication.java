package com.knock_knu.KNOCK_KNU_BE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KnockKnuBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnockKnuBeApplication.class, args);
	}

}
