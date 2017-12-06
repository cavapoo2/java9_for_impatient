package com.andyr.impatient9.ch5;

import java.io.*;
import java.util.ArrayList;

public class C5E1 {
   public static void main(String[] args) {

       ArrayList<Double> d1 = readValue("goodNumbers.txt");
       d1.forEach(System.out::println);
       ArrayList<Double> d2 = readValue("numbers.txt");
       d2.forEach(System.out::println);

   }
   public static ArrayList<Double> readValue(String filename) {

        BufferedReader br = null;
        ArrayList<Double> res = new ArrayList<>();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(filename);
        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                double v = Double.parseDouble(line);
                res.add(v);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;

    }
}
