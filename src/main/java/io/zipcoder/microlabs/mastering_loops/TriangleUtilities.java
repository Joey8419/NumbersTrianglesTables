package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 0; 1 < numberOfRows; i++) {
            result += getRow(i + 1);
            result += "\n";
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i = 0; 1 < numberOfStars; i++) {
            result += "*";
        }
        return result;
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
