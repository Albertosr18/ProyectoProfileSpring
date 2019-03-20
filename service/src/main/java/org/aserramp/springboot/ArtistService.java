package org.aserramp.springboot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ArtistService implements LyricsService{
    @Autowired
    private LyricsRepository lyrics;
    @Override
    public String getLyrics(String artist, String song) {
        return lyrics.getLyrics(artist, song);
    }
}
