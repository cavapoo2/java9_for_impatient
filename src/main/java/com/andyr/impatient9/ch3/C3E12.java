package com.andyr.impatient9.ch3;

import java.io.File;

public class C3E12 {
    public static void main(String[] args) {
        showFiles(".", "xml");

    }

     static public void showFiles(String dir, String ext) {
        File f =null;
        File [] paths;

        try {
            f = new File(dir);
            paths = f.listFiles(fi -> (fi.isFile() && fi.toString().contains(ext)));
            for(File fl : paths) {
                System.out.println(fl);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
