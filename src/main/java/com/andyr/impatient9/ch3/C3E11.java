package com.andyr.impatient9.ch3;
import java.io.File;
import java.io.FileFilter;

public class C3E11 {
    public static void main(String[] args) {
        C3E11.showFiles("/home/febe/java/myjava9_impatient");
        File[] fs = C3E11.getFiles("/home/febe/java/myjava9_impatient");
        for(File f: fs) {
            System.out.println(f);
        }

    }

    static public void showFiles(String dir) {
        File f =null;
        File [] paths;
        try {
            f = new File(dir);
            paths = f.listFiles();
            for(File fl : paths) {
                if(!fl.isDirectory()) {
                    System.out.println(fl);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public void showFiles2(String dir) {
        File f =null;
        File [] paths;
        FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        };
        try {
            f = new File(dir);
            paths = f.listFiles(ff);
            for(File fl : paths) {
                System.out.println(fl);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    static public void showFiles3(String dir) {
        File f =null;
        File [] paths;

        try {
            f = new File(dir);
            paths = f.listFiles(fi -> fi.isFile());
            for(File fl : paths) {
                System.out.println(fl);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public void showFiles4(String dir) {
        File f =null;
        File [] paths;

        try {
            f = new File(dir);
            paths = f.listFiles(File::isFile);
            for(File fl : paths) {
                System.out.println(fl);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    static public File[] getFiles(String dir) {
        File f = null;
        File [] paths;
        try {
            f = new File(dir);
            return f.listFiles(File::isFile);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
