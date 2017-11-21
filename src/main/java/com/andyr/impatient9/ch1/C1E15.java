package com.andyr.impatient9.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class C1E15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int num = in.nextInt();
            ArrayList<ArrayList<Integer>> res = pascal(num);
            res.forEach(al -> {
                al.forEach(v -> System.out.printf("%d ", v));
                System.out.println("");
            });

            Pascal.pascal(num,0,new ArrayList<ArrayList<Integer>>());

        }

    }
    //this looks better than the one below!
    static ArrayList<ArrayList<Integer>> pascal(int n) {
        ArrayList<ArrayList<Integer>> p = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a = new ArrayList<Integer>(1);
        a.add(0,1);
        p.add(0,a);
        if(n == 1) return p;
        for(int i=1; i < n; i++) {
            ArrayList<Integer> prev = p.get(i-1);
            ArrayList<Integer> next = new ArrayList<>(i);
            for(int j = 0; j <= i; j++)
            {
                if(j ==0 || j == i) next.add(j,1);
                else {
                    //System.out.printf("i=%d,j=%d\n",i,j);
                    Integer val = prev.get(j-1) + prev.get(j);
                    next.add(j,val);
                }
            }
            p.add(i,next);
        }
        return p;
    }
}

class Pascal {
    static void show(ArrayList<ArrayList<Integer>> arr) {
        arr.forEach(x -> {
            x.forEach(v -> System.out.printf("%d ",v));
            System.out.println("");
        });
    }
    static void pascal(int n, int row, ArrayList<ArrayList<Integer>> acc) {
        if (n == row ) show(acc);
        else {
            if(row == 0)
            {
                ArrayList<Integer> a = new ArrayList<Integer>(1);
                a.add(0,1);
                acc.add(0,a);
                pascal(n,row+1,acc);
            }
            else {
                ArrayList<Integer> prev = acc.get(row-1);
                ArrayList<Integer> nxt = new ArrayList<>(row+1);
                for(int i=0; i <= row; i++)
                {
                    if(i == 0 || i == row )
                        nxt.add(i,1);
                    else {
                        Integer sum = prev.get(i-1) + prev.get(i);
                        nxt.add(i,sum);
                    }
                }
                acc.add(row,nxt);
                pascal(n,row+1,acc);
            }

        }

    }
}
