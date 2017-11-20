package com.andyr.impatient9.ch1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//あ い う え お か き く け こ さ し す せ そ が ぎ ぐ げ ご ぱ ぴ ぷ ぺ ぽ
public class C1E11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        Pattern pattern = Pattern.compile("[^\\x00-\\x7F]"); //match non ascii
        while(in.hasNext()) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);

            while(matcher.find()){
                System.out.println(matcher.group());
            }

            line.chars().forEach(c -> {
                if (c >= 128){
                    System.out.printf("%s \\u%04x\n",Character.toString((char)c),c);
                }
            });
        }
    }
}
