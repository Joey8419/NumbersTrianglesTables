package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int number = start;
        while (number < stop) {
            result += number;
            number += 2;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int number = start;
        while (number < stop) {
            result += number;
            result += 3;
        }

        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        int number = start;
        while (number < stop) {
            number += 1;
            number = (int)Math.sqrt(number);
        }
        return result;
    }

    public static String getRange(int start) {
        String result = "";
        int number = 0;
        while (number < start) {
            result += number;
            result += 1;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        int number = start;
        while (number < stop) {
            result += number;
            result += 1;
        }
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        int number = start;
        while (number < stop) {
            result += number;
            result += step;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        int number = start;
        while (number < stop) {
            number += 1;
            number = (int)Math.pow(number, exponent);
        }
        return result;
    }
}
