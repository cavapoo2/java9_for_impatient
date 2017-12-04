package com.andyr.impatient9.ch4;

import java.util.Objects;

public class C4E5 {

    public static void main(String[] args){
        Shape circle = new Circle(new Point(3.3,4.4),6.8);
        Shape circle2 = circle.clone();
        System.out.println("Centers are " + circle.getCenter() + ", and " + circle2.getCenter());

    }

    static abstract class Shape implements Cloneable{
        protected Point p;
        public Shape(Point pin) {
            this.p = pin;
        }
        void moveBy(double dx, double dy) {
            p.x = p.x + dx;
            p.y = p.y + dy;
        }
        public abstract Point getCenter();
        public abstract Shape clone();

    }

    static class Circle extends Shape implements Cloneable  {
        private double radius;
        public Circle(Point pin, double radius) {
            super(pin);
            this.radius = radius;
        }
        @Override
        public Circle clone() {
            Circle circle = new Circle(this.p.clone(),this.radius);
            return circle;
        }
        @Override
        public Point getCenter() {
            return this.p;
        }

    }
    static class Rectangle extends Shape implements Cloneable{
        private double width;
        private double height;
        public Rectangle(Point bottomLeft,double width, double height){
            super(bottomLeft);
            this.width = width;
            this.height = height;
        }
        @Override
        public Rectangle clone(){
            return new Rectangle(this.p.clone(),this.width,this.height);
        }
        @Override
        public Point getCenter() {
            return new Point(this.p.getX()+ this.width/2,this.p.getY() + this.height/2);
        }
    }
    static class Line extends Shape implements Cloneable {
        private Point from;
        private Point to;
        private double length;
        public Line(Point from,Point to ){
            super(null);
            this.from = from;
            this.to = to;
        }
        @Override
        public Line clone() {
            return new Line(from.clone(),to.clone());
        }
        @Override
        public Point getCenter() {
            return new Point((from.getX() + to.getX())/2 , (from.getY() + to.getY())/2 );
        }
    }

    static class Point implements Cloneable{
        protected double x;
        protected double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Point clone() {
            return new Point(this.x,this.y);
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
