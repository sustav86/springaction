package com.sustav;

import com.sustav.chap2.Juggle;
import com.sustav.chap2.Stage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chap2Context {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("idol.xml");
//        Juggle duke = context.getBean("duke", Juggle.class);
//        duke.perform();
//
//        Juggle poet = context.getBean("poet", Juggle.class);
//        poet.perform();

        Stage theStage = context.getBean("theStage", Stage.class);
        System.out.println(theStage);

    }
}
