package com.andyr.impatient9.ch2;

public class C2E6 {
    public static void main(String[] args) {
       PointM p =  new PointM(3.0,4.0).translate(1.0,3.0).scale(0.5);
        System.out.println(p.toString());
    }
}
//mutates
class PointM {
        private double x;
        private double y;
        public PointM(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() { return this.x;}
        public double getY() { return this.y;}
        public PointM translate(double x, double y) {
            this.x = this.x + x;
            this.y = this.y + y;
            return this;
        }
        public PointM scale(double fac) {
            this.x = this.x * fac;
            this.y = this.y * fac;
            return this;
        }
        public String toString() {
           return  String.format("%f, %f",this.x,this.y);
        }

    }
