package com.csmithswim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice = new ArrayList<>();

    public Hand(int size) {
        for (int count = 0; count < size; count++) {
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        for (Die die : dice) {
            die.roll(rand);
        }
    }

    public void roll(Random rand, int choice) {

    }

    // public void roll(random rand, choices){}

    @Override
    public String toString(){
        String output = "";
        for (var die: dice){
            output += die.getValue() + " ";
        }
        return output.trim();
    }
}

