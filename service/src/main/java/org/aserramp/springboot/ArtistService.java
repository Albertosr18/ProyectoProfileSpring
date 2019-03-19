package org.aserramp.springboot;



import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ArtistService {

    public String getLyrics(String artist, String song) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.lyrics.ovh/v1/"+artist+"/"+song+"", String.class);


    }
}
