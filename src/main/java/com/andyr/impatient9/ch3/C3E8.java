package com.andyr.impatient9.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class C3E8 {

    public static void main(String[] args) {

        String[] names1 = {"ape","break","dam","clap"};
        String[] names2 = {"dam","clap","break","ape"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(names1));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(names2));
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        luckySort(arr,comp);
        luckySort(arr2,comp);
    }
    static boolean isSorted(ArrayList<String> arr, Comparator<String> comp) {
        for(int i=0, j=1; j < arr.size(); i++, j++) {
            if(comp.compare(arr.get(i),arr.get(j)) > 0) return false;
        }
        return true;
    }
    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while(!isSorted(strings,comp)){
            Collections.shuffle(strings);
            System.out.println("no");
        }
        System.out.println("yes");
        strings.forEach(System.out::println);
    }

}
