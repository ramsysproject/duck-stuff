package com.emramirez.duckstuff;

import com.emramirez.duckstuff.adapter.TurkeyAdapter;
import com.emramirez.duckstuff.model.Duck;
import com.emramirez.duckstuff.model.MallardDuck;
import com.emramirez.duckstuff.model.WildTurkey;

public class DuckStuffApplication {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe turkey adapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
