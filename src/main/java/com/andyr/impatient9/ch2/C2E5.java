package com.andyr.impatient9.ch2;

public class C2E5 {
    public static void main(String[] args) {
        Point p =  new Point(3.0,4.0).translate(1.0,3.0).scale(0.5);
        System.out.println(p.toString());

    }

}
 class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() { return this.x;}
        public double getY() { return this.y;}
        public Point translate(double x, double y) {
            return new Point(this.x + x,this.y+y);
        }
        public Point scale(double fac) {
            return new Point(this.x * fac, this.y * fac);
        }
        public String toString() {
           return  String.format("%f, %f",this.x,this.y);
        }

    }
