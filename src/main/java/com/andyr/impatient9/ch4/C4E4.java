package com.andyr.impatient9.ch4;

import java.util.Objects;

public class C4E4 {
    public static void main(String[] args){
        Shape circle = new Circle(new Point(3.3,4.4),6.8);
        circle.moveBy(1.1,2.2);
        System.out.println(circle.getCenter());
        Shape rec = new Rectangle(new Point(4.4,6.6),11,13);
        rec.moveBy(4.4,9.9);
        System.out.println(rec.getCenter());


    }

    static abstract class Shape {
        protected Point p;
        public Shape(Point pin) {
            this.p = pin;
        }
        void moveBy(double dx, double dy) {
            p.x = p.x + dx;
            p.y = p.y + dy;
        }
        public abstract Point getCenter();

    }

    static class Circle extends Shape {
        private double radius;
        public Circle(Point pin, double radius) {
            super(pin);
            this.radius = radius;
        }
        @Override
        public Point getCenter() {
            return this.p;
        }

    }
    static class Rectangle extends Shape {
        private double width;
        private double height;
        public Rectangle(Point bottomLeft,double width, double height){
            super(bottomLeft);
            this.width = width;
            this.height = height;
        }
        @Override
        public Point getCenter() {
            return new Point(this.p.getX()+ this.width/2,this.p.getY() + this.height/2);
        }
    }
   static class Line extends Shape {
        private Point from;
        private Point to;
        private double length;
        public Line(Point from,Point to ){
            super(null);
            this.from = from;
            this.to = to;
        }
        @Override
        public Point getCenter() {
            return new Point((from.getX() + to.getX())/2 , (from.getY() + to.getY())/2 );
        }
    }

   static class Point {
        protected double x;
        protected double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }


        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }
        @Override
        public String toString() {
            return getClass().getName() + "[x=" + this.x + ",y=" + this.y + "]";
        }
        @Override
        public boolean equals(Object other) {
            if(this == other) return true; //check if objects are equal
            if(other == null) return false;
            if(getClass() != other.getClass()) return false;
            Point op = (Point) other;
            return this.x == op.x && this.y == op.y;

        }
        @Override
        public int hashCode() {
            return Objects.hash(this.x,this.y);
        }

    }
}
