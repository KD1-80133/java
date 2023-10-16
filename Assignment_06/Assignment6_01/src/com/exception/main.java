package com.exception;

public class main {
    public static void main(String[] args) {
        try {
            String input = ExceptionLineTooLong.getInput();
            if (input.length() > 80) {
                throw new ExceptionLineTooLong(input.length());
            } else {
                System.out.println("The length of the string is = " + input.length());
            }
        } catch (ExceptionLineTooLong e) {
            System.out.println("Error: The string is too long. Length is " + e.getLength());
        }
    }
}
