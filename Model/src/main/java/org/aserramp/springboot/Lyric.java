package org.aserramp.springboot;



import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lyric {

    private String title;
    private String artist;
    private String lyrics;

}
