package book.ch05_9.abstactclass;

import book.ch05_7.interfaceTest.BarkInterface;

public class Bouncer {
    void bakrAnimal(BarkInterface barkInterface) {
//        if(animal instanceof Tiger) {
//            System.out.println("어흥");
//        } else if(animal instanceof Lion) {
//            System.out.println("으르렁");
//        }
        barkInterface.bark();
    }
}
