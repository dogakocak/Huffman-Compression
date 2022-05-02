package com.company;

import lombok.Getter;

@Getter
public class Leaf extends Node{
    private final char character;

    public Leaf(char character, int frequency) {
        super(frequency);
        this.character = character;
    }


}
