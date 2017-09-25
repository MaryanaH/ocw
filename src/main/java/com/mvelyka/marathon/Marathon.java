package com.mvelyka.marathon;

import java.util.Arrays;

public class Marathon {
    private Performer[] performers;

    public Marathon(Performer[] performers) {
        this.performers = performers;
    }

    private Performer getNthPerformer(int n) {
        // When it will be sorted?
        if(performers.length == 1) {
            return performers[0];
        } else if(performers.length == 0) {
            return null;
        } else {
            Arrays.sort(performers);
            return performers[n];
        }

    }
    public Performer bestPerformer() {
        return getNthPerformer(performers.length - 1);
    }

    public Performer secondBestPerformer() {
        return getNthPerformer(performers.length - 2);

    }
}
