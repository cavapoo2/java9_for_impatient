package com.andyr.impatient9.ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class C5E2 {
    public static void main(String[] args) {
        try {
            System.out.println(sumOfValues("numbers.txt"));
        }catch(NumberFormatException e ){
            System.out.println("Yes caught ya");
            e.printStackTrace();
        }
        try {
            System.out.println(sumOfVaues2("src/main/resources/numbers.txt"));
        }catch (NumberFormatException e) {
            System.out.println("Caught it");
            e.printStackTrace();
        }
        catch(IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }

    }

    static double sumOfValues(String filename) throws NumberFormatException {
        ArrayList<Double> vals = readValue(filename);
        double sum = 0.0;
        for(double v: vals){
            sum+= v;
        }
        return sum;

    }
    //2 liner
    static double sumOfVaues2(String filename) throws IOException,NumberFormatException {
        Path p = Paths.get("src/main/resources/numbers.txt");
        return Files.lines(p).mapToDouble(Double::parseDouble).sum();
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
        }
        catch(NumberFormatException e){
            //e.printStackTrace();
            throw e; //this goes to caller
        }
        finally {
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
