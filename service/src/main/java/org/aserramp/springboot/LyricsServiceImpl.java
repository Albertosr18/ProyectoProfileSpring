package org.aserramp.springboot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LyricsServiceImpl implements LyricsService{
    @Autowired
    private LyricsRepository lyrics;
    @Override
    public Lyric getLyrics(final String artist, final String song) {

        return lyrics.getLyrics(artist, song);
    }

    @Override
    public Lyric postLyrics(String artist, String song) {
        return null;
    }

}
