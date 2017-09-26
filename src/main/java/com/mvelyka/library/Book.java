package com.mvelyka.library;

import lombok.*;

@Data
public class Book {
    @NonNull
    private String name;

    @NonNull
    private String author;

    @NonNull
    private boolean isAvailable;
}
