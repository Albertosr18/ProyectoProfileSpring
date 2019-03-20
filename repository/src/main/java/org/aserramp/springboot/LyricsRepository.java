package org.aserramp.springboot;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class LyricsRepository implements LyricRepository{
    @Override
    public String getLyrics(String artist, String song) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.lyrics.ovh/v1/"+artist+"/"+song+"", String.class);
    }
}
