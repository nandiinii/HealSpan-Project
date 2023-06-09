package com.example.healspan;

import com.example.healspan.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Import({
		WebConfig.class
})
@ComponentScan("com.example.healspan")
public class HealspanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealspanApplication.class, args);
	}

}
