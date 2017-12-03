package com.andyr.impatient9.ch4;

public class C4E1 {
    public static void main(String[] args) {
        LabeledPoint p = new LabeledPoint("hello",1.1,2.2);
        System.out.println("X=" + p.getX() + ",Y=" + p.getY() + ",lab=" + p.getLabel());

    }

    static class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {return this.x;}
        public double getY() {return this.y;}

    }

    static class LabeledPoint extends Point {
        private String label;
        public LabeledPoint(String label, double x, double y) {
            super(x,y);
            this.label = label;
        }
        public String getLabel(){ return label;}

    }
}
