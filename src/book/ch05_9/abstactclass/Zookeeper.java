package book.ch05_9.abstactclass;

import book.ch05_7.interfaceTest.AnimalInterface;

public class Zookeeper {
    void feed(AnimalInterface animalInterface){
        System.out.println("feed " + animalInterface.getFood());
    }
}
