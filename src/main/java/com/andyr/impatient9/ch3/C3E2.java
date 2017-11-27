
package com.andyr.impatient9.ch3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
//need a cast since we need the employee type. If largest returns Measureable.
public class C3E2 {
    interface Measureable {
        double getMeasure();
    }
    public static void main(String[] args) {
        double[] sal = {20000,30000,40000,50000,25000};
        String[] ids = {"a","b","c","d","e"};
        Employee[] emp = new Employee[5];
        for(int i =0; i < emp.length; i++) {
            emp[i] = new Employee(sal[i],ids[i]);
        }
        double res = average(emp);
        System.out.println("Employee average salary is " + res);
        Employee big = (Employee)largest(emp); //is this ok to cast
        System.out.println("Employee with largest sal is " + big.getId());
        Employee big2 = (Employee)largest2(emp); // another cast
        System.out.println("Employee with largest sal is " + big2.getId());
    }
    static class Employee implements Measureable {
        private final double salary;
        private final String id;
        Employee(double sal,String name) {
            this.salary = sal;
            this.id = name;
        }
        @Override
        public double getMeasure() {
            return this.salary;
        }
        public String getId() { return this.id;}
    }
    static double average(Measureable[] objects) {
        OptionalDouble res = Arrays.asList(objects).stream().mapToDouble(obj -> obj.getMeasure()).average();
        return res.getAsDouble();

    }
    static Measureable largest(Measureable[] objects) {
        Arrays.asList(objects).sort((a,b) -> {
            if(a.getMeasure() > b.getMeasure()) return -1;
            else if(a.getMeasure() < b.getMeasure()) return 1;
            else return 0;
        });
        return objects[0];
    }
    static Measureable largest2(Measureable[] objects) {
        return Arrays.asList(objects).stream().max(Comparator.comparingDouble(o -> o.getMeasure())).get();
    }

}

