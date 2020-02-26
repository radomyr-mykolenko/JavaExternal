package com.radomyr;

import java.util.ArrayList;
import java.util.Random;

public class GameModel {

    private int value;
    private int randomvalue;
    private int maxvalue = 100;

    private ArrayList<Integer> attempts = new ArrayList<Integer>();

    public int getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(int minvalue) {
        this.minvalue = minvalue;
    }

    private int minvalue = 0;

    public int getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(int maxvalue) {
        this.maxvalue = maxvalue;
    }



    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public int getRandomvalue() {
        return randomvalue;
    }
    public void setRandomvalue() {
        this.randomvalue = new Random().nextInt(100);
    }

    public ArrayList<Integer> getAttempts() {
        return attempts;
    }

    public boolean checkMatching(int number) {
        attempts.add(number);
        if (number == randomvalue) {
            return true;
        } else {
            setNewRange(number);
            return false;
        }
    }

    public void setNewRange(int number) {
        if (number > randomvalue) {
            maxvalue = number;
        } else {
            minvalue = number;
        }
    }

}
