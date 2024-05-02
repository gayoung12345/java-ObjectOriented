package com.example;

public class VariableTest {
    static int b = 1; // 메모리에 고정적으로 할당
    void varTest(int a){
        a++;
        b++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        VariableTest vt = new VariableTest();
        int a = 1;
        vt.varTest(a);
        System.out.println(a);
    }
}
