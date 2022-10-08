package com.retofarmatodo.persistence.entity;


public class Numbers3 {

    public Numbers3(int number, boolean isHappy) {
        this.number = number;
        this.isHappy = isHappy;
    }

    private int number;
    private boolean isHappy;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }
}
