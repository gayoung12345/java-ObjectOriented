package com.example.inheritance;

public class ClassC extends ClassB {
    String c;
    // default constructor
//    public ClassC() {
//        super();    // ClassB의 생성자 호출
//    }
    public ClassC() {
        this.c ="ClassC c";
        this.b = "ClassC의 b";
        System.out.println("ClassC default constructor call");
    }
}
