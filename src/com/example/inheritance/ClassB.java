package com.example.inheritance;

public class ClassB extends ClassA {
//    int b;  // b는 멤버변수
    // 기본 생성자
//    public ClassB() {
//        System.out.println("ClassB constructor call");
//    }
    // 멤버변수 초기화 생성자
//    public ClassB(int b) {  // b는 매개변수
//        this.b = b;
//    }

//    int b1;
//    int b2;
//    // 생성자 1
//    public ClassB() {
//    }
//    // 생성자 2
//    public ClassB(int b1, int b2) {
//        this.b1 = b1;
//        this.b2 = b2;
//    }
//    // 생성자 3
//    public ClassB(int b) {
//        this.b1 = b;
//    }
    String b;
    public ClassB() {
        super();    // 부모클래스(ClassA)의 생성자 호출
        this.b = "ClassB b";
        System.out.println("ClassB default constructor call");
        super.a = "ClassB의 a";
    }

}
