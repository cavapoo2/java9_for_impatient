package com.andyr.impatient9.ch5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C5E6 {
    public static void main(String[] args) {
        C5E6.ReadWrite("src/main/resources/goodNumbers.txt","resC5E61.txt");
        C5E6.ReadWrite2("src/main/resources/goodNumbers.txt","resC5E61b.txt");

    }

    public static void ReadWrite(String infilename, String outfilename) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = Files.newBufferedReader(Paths.get(infilename), StandardCharsets.UTF_8);
            out = Files.newBufferedWriter(Paths.get(outfilename),StandardCharsets.UTF_8);
            String line;
            while((line = in.readLine()) != null) {
                double d = Double.valueOf(line);
                System.out.println(d);
                out.write(String.valueOf(d) + " ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(in != null) {
                try {
                    in.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null) {
                try {
                    out.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void ReadWrite2(String infilename, String outfilename) {
        try(BufferedReader in = Files.newBufferedReader(Paths.get(infilename),StandardCharsets.UTF_8);
            BufferedWriter out = Files.newBufferedWriter(Paths.get(outfilename),StandardCharsets.UTF_8);) {
            String line;
            while((line = in.readLine()) != null) {
                double d = Double.valueOf(line);
                out.write(String.valueOf(d) + " ");
            }
        }catch(IOException e ){
            e.printStackTrace();
        }
    }
}
