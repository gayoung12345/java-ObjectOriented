package book.ch05_7.interfaceTest;

public interface AnimalInterface {
    // 상수 (final static)
    final static int LEG_COUNT = 4;
    // 메소드는 구현부분이 없다 : abstract method()
    // 추상 메소드는 인터페이스를 implements한 클래스에서 구현함
    String getFood();

    static int speed(){
        return LEG_COUNT*30;
    }
    default void printFood() {
        System.out.printf("my food is %s\n", this.getFood());
    }
}
