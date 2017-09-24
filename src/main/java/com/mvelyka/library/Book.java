package com.mvelyka.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {
    String name;
    String author;
    boolean isAvailable;
}
