package com.mvelyka.marathon;

public class Performer implements Comparable<Performer>{
    private String name;
    private int score;

    public Performer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Performer o) {
        return (this.score - o.score);
    }

    public String toString() {
        return this.name;
    }
}
