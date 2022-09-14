package CalculateType;

public class Calculator {

    public static String calculate(String input) {
        String[] array = input.split(" ");
        String operation = array[1];
        if (Character.isLetter(array[0].charAt(0)) && Character.isLetter(array[2].charAt(0))) {
            return calculate(array[0], array[2], operation);
        }
        double a = Double.parseDouble(array[0]);
        double b = Double.parseDouble(array[2]);
        double result = calculate(a, b, operation);
        return Double.toString(result);
    }

    private static String calculate(String a, String b, String operation) {
        if (operation.equals("+")) {
            return a + b;
        }
        if (operation.equals("-")) {
            if (a.contains(b)) {
                return a.replace(b, "");
            }
        }
        throw new IllegalArgumentException();
    }

    private static double calculate(double a, double b, String operation) {

        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> b == 0 ? 0 : a / b;
            case "*" -> a * b;
            case "%" -> a % b;
            default -> 0;
        };
    }

    public static int getNumbers(int a, int b) {
        String numberToString = String.valueOf(Math.abs(a + b));
        String[] array = numberToString.split("");
        int result = 0;
        for (String s : array) {
            if (Integer.parseInt(s) % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static String getMinimalType(String input) {
        long number = Long.parseLong(input);
        if (number > 2147483647 || number < -2147483648) {
            return "Long";
        }
        if (number > 32767 || number < -32768) {
            return "Int";
        }
        if (number > 127 || number < -128) {
            return "Short";
        }
        return "Byte";
    }
}