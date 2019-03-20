package org.aserramp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LyricsControllerImp implements LyricsController{

    @Autowired
    private LyricsService service;

    public Lyric getLyrics(String artist, String song){
      return service.getLyrics(artist, song);

    }

    @Override
    public Lyric postLyrics(String artist, String song) {
        return null;
    }


}
