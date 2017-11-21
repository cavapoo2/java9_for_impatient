package com.andyr.impatient9.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class C1E12 {
    public static void main(String[] args) {
        C1E12.lottoGen2();

    }
    //this looks better way
    static void lottoGen() {
        Random r = new Random();
        r.ints(1,50).distinct().limit(6).sorted().forEach(System.out::println);
    }
    static void lottoGen2() {
        Random r = new Random();
        ArrayList<Integer> ar = new ArrayList<>(49);
        ArrayList<Integer> res = new ArrayList<>(6);
        for(int i=1; i < 50; i++) ar.add(i-1,i);// init

        for(int i=0; i < 6; i++) {
            int nxt = r.nextInt(49- i); //0 to 48 which correspond to the index
            res.add(ar.remove(nxt));
        }
        res.sort((a,b) -> {
            if (a < b) return -1;
            else if(a > b) return 1;
            else return 0;
        });
        res.forEach(System.out::println);
    }
}
