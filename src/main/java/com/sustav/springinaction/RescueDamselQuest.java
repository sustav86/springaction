package com.sustav.springinaction;

public class RescueDamselQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Spring " + this);
    }
}
