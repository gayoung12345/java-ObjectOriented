package book.ch05_7.interfaceTest;

public class Lion extends Animal implements AnimalInterface, BarkInterface {
    @Override
    public String getFood() {
        return "banana";
    }

    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}
