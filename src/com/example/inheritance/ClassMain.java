package com.example.inheritance;

public class ClassMain {
    public static void main(String[] args) {
//        ClassB b = new ClassB(100);
//        System.out.println(b.b);

//        ClassB b = new ClassB(100, 100);
//        System.out.println(b.b1 + b.b2);
        ClassC c = new ClassC();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);

        ClassB b = new ClassB();
        System.out.println(b.a);
        System.out.println(b.b);
//        System.out.println(b.c);  // 부모는 자식의 정보를 알 수 없다

        ClassA a = new ClassA();
        System.out.println(a.a);


    }
}
