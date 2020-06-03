package com.sangkon.tdd;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int number) {
        return new Dollar(this.amount * number);
    }

}
