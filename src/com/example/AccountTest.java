package com.example;

public class AccountTest {
    public static void main(String[] args) {
        // Account 객체 생성
        Account account1 = new Account();
        // 입금
        account1.deposit(10000);
        // 잔액 조회
        account1.checkBalance();
        // 출금
        account1.withdraw(5000);
        // 잔액 조회
        account1.checkBalance();
        // 출금
        account1.withdraw(10000);
    }
}
