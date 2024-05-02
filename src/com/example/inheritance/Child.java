package com.example.inheritance;

public class Child extends Parent {
    public String value = "child";
    // public boolean house;
    // public char gender;
    public String hello(){
        return "hollo child";
    }
    public void call(){
        System.out.println("value: " + value);  // >> child (this는 생략이 가능하다)
        System.out.println("this value: " + this.value);
        System.out.println("super value: " + super.value);
        System.out.println("this hello: " + this.hello());
        System.out.println("super hello: " + super.hello());
    }
}

