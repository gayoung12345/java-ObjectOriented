package book.ch05_9.abstactclass;

public class Lion extends Predator { // 추상클래스를 상속받은 Lion
    @Override
    String getFood() { // 추상클래스 안에 있는 추상메소드를 구현함
        return "banana";
    }
}
