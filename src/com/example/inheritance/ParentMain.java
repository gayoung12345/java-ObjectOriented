package com.example.inheritance;

public class ParentMain {
    public static void main(String[] args) {
        Child child = new Child();
//        System.out.println(child.house);    // null
//        System.out.println(child.gender);   // 깨진 글자
        child.call();
    }
}
