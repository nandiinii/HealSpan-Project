package com.example.healspan.config;

import com.example.healspan.controller.HealspanController;
import com.example.healspan.persistence.dao.jpa.HealspanDAO;
import com.example.healspan.service.HealspanService;
import com.example.healspan.service.impl.HealspanServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Autowired
    private HealspanDAO healspanDAO;
//    @Primary
//    @Bean
//    public HealspanService healspanService() {
//        return new HealspanServiceImpl(healspanDAO);
//    }

    @Bean
    public HealspanController healspanController(HealspanService healspanService) {
        return new HealspanController(healspanService);
    }
}
