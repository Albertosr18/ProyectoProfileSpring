package org.aserramp.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface LyricsController {

    @GetMapping(value="lyrics/{artist}/{song}")
    Lyric getLyrics(@PathVariable(value="artist") String artist, @PathVariable(value="song") String song);


    @PostMapping(value="lyrics/{artist}/{song}")
    Lyric postLyrics(@PathVariable(value="artist") String artist, @PathVariable(value="song") String song);

}
