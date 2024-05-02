package com.example;

class Updater {
    void update(Counter counter) {  // 매개변수로 객체를 받음(입력받은 객체를 그대로 사용)
        counter.count++;
    }
}
class Counter{
    int count = 0;  // 객체 변수
}

public class Sample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("before update: " + counter.count);
        Updater updater = new Updater();
        updater.update(counter);
        System.out.println("after update: " + counter.count);
    }
}
