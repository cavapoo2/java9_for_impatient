package com.andyr.impatient9.ch1;

import java.util.Scanner;

public class C1E9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] c = line.replace("[^A-Za-z]", " ").split("\\s+");
            for (String s : c) {
                if (s.equals("World")) {
                    System.out.println("Yes World found");
                }
            }
        }
    }
}
