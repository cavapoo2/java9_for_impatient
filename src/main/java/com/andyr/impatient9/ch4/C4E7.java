package com.andyr.impatient9.ch4;

public class C4E7 {

    public enum Colors {
        BLACK, RED, BLUE,GREEN,CYAN,MAGENTA,YELLOW,WHITE;

        public static Colors getRed() {
            return RED;
        }
        public static Colors getGreen() {
            return GREEN;
        }
        public static Colors getBlue() {
            return BLUE;
        }
    }
    public static void main(String[] args) {
        Colors red = Colors.getRed();
        System.out.println(red.name());
        System.out.println(red.ordinal());

    }

}
