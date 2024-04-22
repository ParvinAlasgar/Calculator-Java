package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1, num2, result = 0;
        byte operation;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scn.nextDouble();
        System.out.println("Enter second number");
        num2 = scn.nextDouble();
        System.out.println("Choose operation: 1-Addition,2-Subtraction,3-Multiplication,4-Division");
        operation = scn.nextByte();

        switch (operation) {
            case 1 ->
                result = num1 + num2;
            case 2 ->
                result = num1 + num2;
            case 3 ->
                result = num1 * num2;
            case 4 -> {
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Division by zero is undefined");
                }
                result = num1 / num2;
            }
            default ->
                System.out.println("Please choose correct operation.");
        }
        System.out.println(result);
    }
}
