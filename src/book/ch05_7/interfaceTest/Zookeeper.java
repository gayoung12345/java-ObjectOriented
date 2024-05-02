package book.ch05_7.interfaceTest;

public class Zookeeper {
    void feed(AnimalInterface animalInterface){
        System.out.println("feed " + animalInterface.getFood());
    }
}
