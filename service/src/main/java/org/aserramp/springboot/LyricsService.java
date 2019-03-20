package org.aserramp.springboot;

public interface LyricsService {
    Lyric getLyrics(String artist, String song);
    Lyric postLyrics(String artist, String song);
}
