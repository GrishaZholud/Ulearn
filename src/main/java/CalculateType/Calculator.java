package CalculateType;

import java.util.Arrays;

public class Calculator {

    public static String calculate(String input) {
        String[] array = input.split(" ");
        String operation = array[1];
        try {
            if (Character.isLetter(array[0].charAt(0)) && Character.isLetter(array[2].charAt(0))) {
                return calculate(array[0], array[2], operation);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        double a = Double.parseDouble(array[0]);
        double b = Double.parseDouble(array[2]);
        double result = calculate(a, b, operation);
        return Double.toString(result);
    }

    private static String calculate(String a, String b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                if (a.contains(b)) {
                    return a.replace(b, "");
                }
        }
        throw new IllegalArgumentException();
    }

    private static double calculate(double a, double b, String operation) {

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException();
                }
                return a / b;
            case "*":
                return a * b;
            case "%":
                return a % b;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int getNumbers(int a, int b) {
        String numberToString = String.valueOf(Math.abs(a + b));
        char[] array = numberToString.toCharArray();
        int result = 0;
        for (char s : array) {
            if (s % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static String getMinimalType(String input) {
        if (input.matches("[0-9]")) {
            throw new IllegalArgumentException();
        }
        long number = Long.parseLong(input);
        if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
            return "Long";
        }
        if (number > Short.MAX_VALUE || number < Short.MIN_VALUE) {
            return "Int";
        }
        if (number > Byte.MAX_VALUE || number < Byte.MIN_VALUE) {
            return "Short";
        }
        return "Byte";
    }
}