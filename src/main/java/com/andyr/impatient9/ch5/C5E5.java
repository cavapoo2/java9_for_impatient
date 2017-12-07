package com.andyr.impatient9.ch5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C5E5 {
    public static void main(String[] args) {
        C5E5.readWrite("src/main/resources/goodNumbers.txt","res.txt");

    }
    public static void readWrite(String infilename,String outfilename){
        try {
            Scanner in = new Scanner(new File(infilename)); //note need relative path here like src/main/resources/filename
            PrintWriter out = new PrintWriter(outfilename);
            while(in.hasNextDouble()) {
                double d = in.nextDouble();
                System.out.println(d);
                out.println(d);
            }
            in.close();
            out.close();
        }catch ( NullPointerException | FileNotFoundException | IllegalStateException e) {
            e.printStackTrace();
        }

    }

}
