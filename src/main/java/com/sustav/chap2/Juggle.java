package com.sustav.chap2;

public class Juggle implements Performer {

    private int beanBags = 3;

    public Juggle(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggle() {
    }

    @Override
    public void perform() {
        System.out.println("Perform with beans: " + beanBags);
    }
}
