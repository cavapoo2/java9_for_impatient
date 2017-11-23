package com.andyr.impatient9.ch2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class C2E1 {
    private static final String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    public static void main(String[] args) {
        showMonth(2017,11);
        showMonth(2018,1);

    }
    static void showMonth(int year, int month) {
        LocalDate date =  LocalDate.of(year,month,1);
        DayOfWeek day = date.getDayOfWeek();
        Month m = date.getMonth();
        int y= date.getYear();
        System.out.println(m + " " + String.valueOf(y));
        printDaysColumn();
        printNums(day.getValue(),date.lengthOfMonth());
    }

    static void printDaysColumn() {
        for(int i =0; i < 7; i++)
            System.out.printf("%-4s",days[i]);
        System.out.println("");
    }
    //very crude, there's better way than this!
    static void printNums(int start, int length) {
        String gap1 = "   ";
        String gap2 = "  ";
        String gapInit = "    ";
        String build = "";
        int beginpos = start % 7;
        int offset = beginpos;
        //pad spaces for begin pos
        while(beginpos > 0 ) {
            build += gapInit;
            beginpos--;
        }
        for(int i=1; i <= length; i++) {
            if (offset == 0){
                System.out.println(build);
                build="";
                build = String.valueOf(i);
            }else {
                if (i > 10 )
                    build = build + gap2 + String.valueOf(i);
                else if( i > 1)
                    build = build + gap1 + String.valueOf(i);
                else
                    build = build + String.valueOf(i);
            }
            offset = (offset + 1) % 7;
        }
        System.out.println(build);
    }
}
