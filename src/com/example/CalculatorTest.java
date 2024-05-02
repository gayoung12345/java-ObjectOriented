package com.example;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result1 = calc.add(2.0, 3.0);
        System.out.println(result1);
        double result2 = calc.sub(2.0, 3.0);
        System.out.println(result2);
        double result3 = calc.mul(2.0, 3.0);
        System.out.println(result3);
        double result4 = calc.div(2.0, 3.0);
        System.out.println(result4);
        double result5 = calc.pow(2.0, 3.0);
        System.out.println(result5);

        // 가변인자를 받아 합계를 구하는 sumArgs() 호출
        double sum1 = calc.sumArgs(1,2,3,4,5);
        double sum2 = calc.sumArgs(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
