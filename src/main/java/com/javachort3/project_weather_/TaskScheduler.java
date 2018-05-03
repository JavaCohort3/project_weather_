package com.javachort3.project_weather_;


import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.logging.Logger;


@Component
public class TaskScheduler {

    private static final Logger log = (Logger) LoggerFactory.getLogger(Application.class);

        @Bean
        public RestTemplate restTemplate(RestTemplateBuilder builder){
            return builder.build();
        }

        @Bean
        public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
            return args -> {
                log.info("Application started with command-line arguments: {} . " +
                        "\n To kill this application, press Ctrl + C. ", Arrays.toString(args));
            };
        }
    }

