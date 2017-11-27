package com.andyr.impatient9.ch3;
import java.util.Arrays;
import java.util.OptionalDouble;

public class C3E1 {
    interface Measureable {
        double getMeasure();
    }
    public static void main(String[] args) {
       double[] sal = {20000,30000,40000,50000};
       Employee[] emp = new Employee[4];
       for(int i =0; i < emp.length; i++) {
           emp[i] = new Employee(sal[i]);
       }
       double res = average(emp);
       System.out.println("Employee average salary is " + res);
    }
    static class Employee implements Measureable {
        private final double salary;

        Employee(double sal) {
            this.salary = sal;
        }

        @Override
        public double getMeasure() {
            return this.salary;
        }
    }
    static double average(Measureable[] objects) {
        OptionalDouble res = Arrays.asList(objects).stream().mapToDouble(obj -> obj.getMeasure()).average();
        return res.getAsDouble();

    }

}

