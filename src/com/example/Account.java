package com.example;

public class Account {
    // 입출금 금액을 나타내는 멤버변수(인스턴스 변수)
    private int amount;
    // 잔액을 나타내는 정적변수(클래스 변수)
    private static int balance;

    // 생성자
    public Account() { // 멤버변수 초기화
        // 기본 생성자
    }

    // 입금 메소드
    public void deposit(int depositAmount) {
        amount = depositAmount;
        balance += depositAmount;
        System.out.println(amount + "원이 입금되었습니다.");
    }
    // 출금 메소드
    public void withdraw(int withdrawAmount) {
        if (withdrawAmount <= balance) {
            amount = withdrawAmount;
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다. (남은 잔액: " + balance + ")");
        }
    }
    // 잔액 조회 메소드
    public void checkBalance() {
        System.out.println("현재 남은 잔액은 " + balance + "원 입니다.");
    }

}
