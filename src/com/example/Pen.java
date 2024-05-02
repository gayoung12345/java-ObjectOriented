package com.example;

public class Pen {

    // 멤버변수 선언
    private String color;
    private int price;

    // 생성자 선언
    public Pen(String color, int price) {   // 매개변수(parameter)
        this.color = color; // 멤버(인스턴스, 객체)변수 초기화
        this.price = price;
    } // 생성자가 하나도 없으면 자동으로 default 생성자가 생성됨
    // 생성자 중복(생성자 overloading)
    public Pen() {
    }
    public Pen(String color) {
        this.color = color;
    }
    public Pen(int price) {
        this.price = price;
    }

    // 메소드 선언
    public void write(int count){
        for(int i=0; i<count; i++){
            System.out.println("Hello World!!");
        }
        return;
    }

    // getter setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    // getter setter를 사용하는 이유
    // 다른 클래스에서 멤버변수를 변형하는 것을 방지하기위해
    // private 속성으로 정의해야함
}
