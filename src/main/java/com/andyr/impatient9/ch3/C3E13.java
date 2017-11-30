package com.andyr.impatient9.ch3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class C3E13 {
    public static void main(String[] args) {
        File[] contents = getFiles(".");
        File[] contents2 = getFiles(".");

        System.out.println("1st  way");
        sortFiles(contents);
        System.out.println("2nd  way");
        sortFiles(contents2);
    }

    static void sortFiles(File[] contents) {
        Arrays.sort(contents, Comparator.comparing(File::isFile).thenComparing(File::getName));
        Arrays.stream(contents).forEach(System.out::println);
    }

    static void sortFiles2(File[] contents) {
        ArrayList<File> dirs = new ArrayList<>();
        ArrayList<File> files = new ArrayList<>();
        for(File f: contents){
            if(f.isDirectory()) {
                dirs.add(f);
            }
            else {
                files.add(f);
            }
        }
        Collections.sort(files);
        Collections.sort(dirs);
       // System.out.println("Dirs:");
        dirs.forEach(System.out::println);
       // System.out.println("Files:");
        files.forEach(System.out::println);

    }

    static public File[] getFiles(String dir) {
        File f = null;
        File[] paths;
        try {
            f = new File(dir);
            paths = f.listFiles();
            return paths;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}