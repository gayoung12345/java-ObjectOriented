package book.ch05_7.interfaceTest;

public class Tiger extends Animal implements AnimalInterface, BarkInterface{

    @Override
    public String getFood() {
        return "apple";
    }

    @Override
    public void printFood() {
        AnimalInterface.super.printFood();
    }

    @Override
    public void bark() {
        System.out.println("어흥");
    }
}
