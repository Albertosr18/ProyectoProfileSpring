package org.aserramp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
public class LyricsController {

    @Autowired
    private ArtistService service;

    @RequestMapping(value="/lyrics/{artist}/{song}", method = RequestMethod.GET)
    public String Lyrics(@PathVariable(value="artist") String artist, @PathVariable(value="song") String song) {
        return service.getLyrics(artist, song);
    }




}
