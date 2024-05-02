package com.example;

public class MethodTest {

    // method 4가지 유형

    // 1. 입력X 출력 X
    void say1() {
        System.out.println("Hello World");
    }

    // . 입력O 출력 X
    void say2(String name) {
        System.out.println("Hi " + name);
    }

    // 3. 입력X 출력 X
    String say3() {
        return "Hi ";
    }
    // 4. 입력O 출력 O
    String say4(String name) {
        return "Hi "+name;
    }

    public static void main(String[] args) {
        MethodTest mt = new MethodTest();

        mt.say1();

        mt.say2("World");

        String result = mt.say3();
        System.out.println(result);

        System.out.println(mt.say4("World"));

    }
}
