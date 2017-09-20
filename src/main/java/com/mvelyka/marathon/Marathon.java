package com.mvelyka.marathon;

import java.util.Arrays;

public class Marathon {
    private Performer[] performers;

    public Marathon(Performer[] performers) {
        this.performers = performers;
    }

    public Performer bestPerformer() {
        Performer bestPerformer = performers[0];
        for(int i = 0; i < performers.length; i++) {
            if(bestPerformer.getScore() <= performers[i].getScore()) {
                bestPerformer = performers[i];
            }
        }
        return bestPerformer;
    }

    public Performer secondBestPerformer() {
        Arrays.sort(performers);
        return performers[performers.length - 2];

    }
}
