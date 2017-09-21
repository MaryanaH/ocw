package com.mvelyka.marathon;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Performer implements Comparable<Performer> {

    private String name;
    private int score;

    @Override
    public int compareTo(Performer o) {
        return (this.score - o.score);
    }
}
