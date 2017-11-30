package com.andyr.impatient9.ch3;

import java.util.Arrays;
import java.util.Comparator;

public class C3E15 {
    public static void main(String[] args){
        Employee[] emps = new Employee[5];
        String[] names = {"john", "terry","mike","pete","jim"};
        double[] sals = {20000,30000,20000,20000,30000};
        for(int i=0; i < 5; i++) {
            emps[i] = new Employee(sals[i],names[i]);
        }
        Arrays.sort(emps, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

        Arrays.stream(emps).forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

    }

    static class Employee {
        private final double salary;
        private final String name;

        Employee(double sal,String name) {
            this.salary = sal;
            this.name = name;
        }
        public String getName() { return this.name;}
        public double getSalary() {
            return this.salary;
        }
    }
}
