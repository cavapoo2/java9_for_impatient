package com.andyr.impatient9;
import java.util.Arrays;
import java.util.Scanner;

public class Util {
    public static String[] getArgs(Scanner in) {
        return in.nextLine().split("\\s+");
    }
    public static double[] convert(String[] in) {
        return Arrays.stream(in).mapToDouble(Double::parseDouble).toArray();

    }
}
