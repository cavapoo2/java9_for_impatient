package com.andyr.impatient9.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class C2E10 {
    public static void main(String[] args) {
        Random gen = new Random(System.currentTimeMillis());
        int r = RandomNumbers.nextInt(gen,0,5);
        System.out.println(r);
        int[] arr = {110,111,112,113,114,115,116,117,118,119,120};
        int r2 = RandomNumbers.nextInt(gen,arr);
        System.out.println(r2);

        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(20,21,22,23,24,25,26,27,28,29,30));
        int r3 = RandomNumbers.nextInt(gen,al);
        System.out.println(r3);


    }
    private static class RandomNumbers {
        public static int nextInt(Random generator, int low, int high) {
            return low + generator.nextInt(high-low+1);
        }
        public static int nextInt(Random generator, int[] arr) {
            if (arr.length != 0) {
                return arr[nextInt(generator,0,arr.length-1)];
            }
            else return 0;
        }
        public static int nextInt(Random generator, ArrayList<Integer> arr) {
            if(arr.size() != 0) {
                return arr.get(nextInt(generator,0,arr.size()-1));
            }
            else return 0;
        }
    }
}
