package org.aserramp.springboot;


public interface LyricsRepository {
     Lyric getLyrics(String artist, String song);
}
