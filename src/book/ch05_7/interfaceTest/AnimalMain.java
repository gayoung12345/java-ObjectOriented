package book.ch05_7.interfaceTest;

public class AnimalMain {
    public static void main(String[] args) {

        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);

        tiger.printFood();

        System.out.println(AnimalInterface.speed());

        // Tiger is a Animal == true 이면, is a 관계가 성립한다.
        // 자식 클래스에 의해 만들어진 객체는 언제나 부모 클래스의 자료형을 허용할 수 있다.
        Animal animal1 = new Tiger();
        Animal animal2 = new Lion();
        zookeeper.feed((AnimalInterface) animal1);  // feed()는 interface type만 들어갈 수 있으므로
        zookeeper.feed((AnimalInterface) animal2);  // type casting 해줌

        Bouncer bouncer = new Bouncer();
        bouncer.bakrAnimal(tiger);
        bouncer.bakrAnimal(lion);
    }
}
