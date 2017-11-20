package com.andyr.impatient9.ch1;
import com.andyr.impatient9.Util;
import java.util.ArrayList;
import java.util.Scanner;

public class C1E8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String[] arr = Util.getArgs2(in); //remove punctuation and split on spaces
            for(String s: arr) {
                SubStrings.subStrings(s);
            }
            System.out.println("Loop Version");
             for(String s: arr) {
                C1E8.subStrings(s);
            }
        }
    }
    public static void subStrings(String arr) {
        for(int i=0; i < arr.length(); i++) {
            for(int j = arr.length() ; j > i; j--){
                System.out.println(arr.substring(i,j));
            }
        }
    }

}
//recursive version, not as pretty as looped version above
class SubStrings {
    static ArrayList<String> part = new ArrayList<>();
    public static void subStrings(String in) {
        if (in.length() != 0) {
            clipStrings(in);
            subStrings(in.substring(1, in.length()));
        }
    }
    private static void clipStrings(String remain)  {
        if (remain.length() != 0) {
            part.add(remain);
            clipStrings(remain.substring(0, remain.length() - 1));
        } else {
            show();
            part.clear();
        }
    }
    private static void show() {
        for (String s : part) {
            System.out.println(s);
        }
    }
}
