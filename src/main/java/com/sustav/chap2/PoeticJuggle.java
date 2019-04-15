package com.sustav.chap2;

import org.springframework.beans.factory.annotation.Value;

public class PoeticJuggle extends Juggle {

    private Poem poem;
    private double randomKey;
    @Value("YES")
    private String value;

    public PoeticJuggle(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public PoeticJuggle(Poem poem) {
        super();
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("%%%% Recite %%%%");
        poem.recite();
        System.out.println("RANDOM KEY: " + randomKey + ", VALUE: " + value);
    }

    public Poem getPoem() {
        return poem;
    }

    public void setRandomKey(double randomKey) {
        this.randomKey = randomKey;
    }
}
