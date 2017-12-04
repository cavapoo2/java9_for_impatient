package com.andyr.impatient9.ch4;

import java.util.Objects;

public class C4E3 {
     public static void main(String[] args) {
        LabeledPoint p = new LabeledPoint("hello", 1.1, 2.2);
        p.showXAndY(); //when x and y are private it won't compile, but ok when x and y are protected

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

    static class LabeledPoint extends Point {
        private String label;

        public LabeledPoint(String label, double x, double y) {
            super(x, y);
            this.label = label;
        }

        //test if i can get access to x and y
        public void showXAndY() {
            System.out.println("x=" + x + ",y=" + y);
        }

        public String getLabel() {
            return label;
        }
        @Override
        public String toString() {
            return super.toString() + "[" + label +"]";
        }
        @Override
        public boolean equals(Object other) {
            if(!super.equals(other)) return false;
            LabeledPoint op = (LabeledPoint) other;
            return Objects.equals(label,op.label);
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(),label);
        }

    }
}
