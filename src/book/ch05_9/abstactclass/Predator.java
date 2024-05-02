package book.ch05_9.abstactclass;

// 추상클래스
public abstract class Predator extends Animal {

    // 추상클래스의 상수 (final static)
    static int LEG_COUNT = 4;

    // 추상메소드
    abstract String getFood();

    void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    static int speed(){
        return LEG_COUNT * 30;
    }

}
