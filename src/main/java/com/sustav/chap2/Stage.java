package com.sustav.chap2;

public class Stage {

    private static Stage instance;

    private Stage() {
    }

    public static Stage getInstance() {
        if (instance == null) {
            synchronized (Stage.class) {
                instance = new Stage();
            }
        }

        return instance;
    }


}
