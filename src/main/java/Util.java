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
    public static int[] convert2Ints(String[] in) {
        return Arrays.stream(in).mapToInt(Integer::parseInt).toArray();

    }
    public static long[] convert2Longs(String[] in) {
        return Arrays.stream(in).mapToLong(Long::parseLong).toArray();
    }
    //replace punctuation with space, then split on the white space.
    public static String[] getArgs2(Scanner in) {return in.nextLine().replaceAll("[^A-Za-z]"," ").split("\\s+");}
}
