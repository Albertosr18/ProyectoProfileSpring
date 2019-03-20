package org.aserramp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Repository
public class LyricsRepositoryImpl implements LyricsRepository {

    private final String uri = "https://api.lyrics.ovh/v1/{artist}/{song}";
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Lyric getLyrics(String artist, String song) {
        Map<String, String> params = new HashMap<>();
        params.put("artist", artist);
        params.put("song", song);
        return restTemplate.getForObject(uri, Lyric.class, params);
    }
}
