package org.aserramp.springboot;


import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class LyricsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyricsApplication.class, args);

    }
}