package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.hierarchical.*;
import com.xworkz.inheritance.multilevel.School;
import com.xworkz.inheritance.single.Shiva;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.bark();
        dog.eat(dog);

        Cat cat=new Cat();
        cat.mewo(cat);
        cat.eat();

        Elephant elephant = new Elephant();
        elephant.sleep(elephant);
        elephant.trumpet();

        Tiger tiger=new Tiger();
        tiger.roar();
        tiger.breathe(tiger);

        Lion lion=new Lion();
        lion.hunt();
        lion.prey(lion);

        Rat rat=new Rat();
        rat.Walk();
        rat.move(rat);

        Cheetah cheetah=new Cheetah();
        cheetah.run();
        cheetah.fast(cheetah);

        School school=new School();

        Shiva shiva=new Shiva();

    }
}
