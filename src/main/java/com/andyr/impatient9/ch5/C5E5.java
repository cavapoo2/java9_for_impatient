package com.andyr.impatient9.ch5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C5E5 {
    public static void main(String[] args) {
        C5E5.readWrite("src/main/resources/goodNumbers.txt","res.txt");
        System.out.println("other method");
        C5E5.readWrite2("src/main/resources/goodNumbers.txt","res2.txt");

    }
    //not sure this is ok. if in.close throws, will out.close be closed
    public static void readWrite(String infilename,String outfilename){
            Scanner in = null;
            PrintWriter out = null;
        try {
            in = new Scanner(new File(infilename)); //note need relative path here like src/main/resources/filename
            out = new PrintWriter(outfilename);
            while(in.hasNextDouble()) {
                double d = in.nextDouble();
                System.out.println(d);
                out.println(d);
            }
        }catch ( NullPointerException | FileNotFoundException | IllegalStateException e) {
            e.printStackTrace();
        }finally {
            in.close();
            out.close();
        }

    }
    //this is better as in the book
    public static void readWrite2(String infilename, String outfilename) {
        try(Scanner in = new Scanner(new File(infilename));
        PrintWriter out = new PrintWriter(outfilename)) {
            while(in.hasNextDouble()) {
                double d = in.nextDouble();
                System.out.println(d);
                out.println(d);
            }
        }catch( NullPointerException | FileNotFoundException | IllegalStateException e)  {
            e.printStackTrace();
        }
    }
}
