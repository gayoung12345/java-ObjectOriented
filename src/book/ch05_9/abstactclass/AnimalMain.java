package book.ch05_9.abstactclass;

public class AnimalMain {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Tiger tiger = new Tiger();

//        lion.getFood();
        lion.printFood();   // printFood()에서 getFood()를 호출
//        tiger.getFood();
        tiger.printFood();




    }
}
