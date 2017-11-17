package ch1;

import java.util.Scanner;

public class C1E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int value = in.nextInt();
            System.out.printf("Angles are %d and %d\n", value % 360, Math.floorMod(value,360) );
        }

    }
}
