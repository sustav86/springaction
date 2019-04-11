package com.sustav.chap2;

public class PoeticJuggle extends Juggle {

    private Poem poem;

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
    }
}
