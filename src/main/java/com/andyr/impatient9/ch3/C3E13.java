package com.andyr.impatient9.ch3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
//easiest way i can think of is this, sure there is better way.
public class C3E13 {
    public static void main(String[] args) {
        File[] contents = showFiles(".");
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
        System.out.println("Dirs:");
        dirs.forEach(System.out::println);
        System.out.println("Files:");
        files.forEach(System.out::println);
    }

    static public File[] showFiles(String dir) {
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