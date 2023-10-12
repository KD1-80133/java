package com.calculator;

public class CalculateNewBalance {

    public static void main(String[] args) {
        Credit creditAccount = new Credit(12345, 1000, 500, 200, 1500); // Initialize with some values or use accept() method.

        System.out.println("Account Information:");
        creditAccount.accept();
        creditAccount.display();
        creditAccount.calculateNewBalance(); 
    }
}
