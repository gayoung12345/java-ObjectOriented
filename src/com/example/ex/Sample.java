package com.example.ex;

import java.util.ArrayList;
import java.util.Arrays;

//class Calculator{
//    int value;
//    public Calculator() {
//        this.value = 0;
//    }
//    void add(int val){
//        this.value += val;
//    }
//    int getValue(){
//        return this.value;
//    }
//    // Q3
//    boolean isOdd(int val){
//        if(val % 2 != 0){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    // Q4
//    public int avg(int[] data) {
//        int sum = 0;
//        for(int i = 0; i < data.length; i++){
//            sum += data[i];
//        }
//        return sum / data.length;
//    }
//    public int avg(ArrayList<Integer> data) {
//        int sum = 0;
//        for(int i = 0; i < data.size(); i++){
//            sum += data.get(i);
//        }
//        return sum / data.size();
//    }
//}

// Q1
//class UpgradeCalculator extends Calculator{
//    void minus(int val){
//        this.value -= val;
//    }
//}
// Q2
//class MaxLimitCalculator extends Calculator{
//    @Override
//    void add(int val) {
//        this.value += val;
//        if(value >100) {
//            value = 100;
//        }
//    }
//}

// Q6
//class Calculator {
//    Integer value = 0;
//
//    void add(int val) {
//        this.value += val;
//    }
//
//    public Integer getValue(){
//        return this.value;
//    }
//}

// Q8



public class Sample {
    public static void main(String[] args) {
        // Q1
//        UpgradeCalculator cal = new UpgradeCalculator();
//        cal.add(10);
//        cal.minus(3);
//        System.out.println(cal.getValue());

        // Q2
//        MaxLimitCalculator cal = new MaxLimitCalculator();
//        cal.add(50);
//        cal.add(60);
//        System.out.println(cal.getValue());

        // Q3
//        Calculator cal = new Calculator();
//        System.out.println(cal.isOdd(3));
//        System.out.println(cal.isOdd(4));

        // Q4
//        int[] data = {1,3,5,7,9};
//        Calculator cal = new Calculator();
//        int result = cal.avg(data);
//        System.out.println(result);
//        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
//        Calculator cal2 = new Calculator();
//        int result2 = cal2.avg(data2);
//        System.out.println(result2);

        // Q5
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> b = a;
//        a.add(4);   // a = {1,2,3,4}
//        System.out.println(b.size());   // >> 4

        // Q6
//        Calculator cal = new Calculator();
//        cal.add(3);
//        System.out.println(cal.getValue());


    }
}
