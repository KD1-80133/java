package com.exception;

import java.util.Scanner;

public class ExceptionLineTooLong extends Exception  {
    private int length;

    public ExceptionLineTooLong(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String=");
        String input = sc.nextLine();
        sc.close();
        return input;
    }
}
