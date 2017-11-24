package com.andyr.impatient9.ch2;

public class C2E9 {
    public static void main(String[] args) {
        Car car = new Car(30,10,20,20);
        System.out.println(car.toString());
        car.drive(400);
        System.out.println(car.toString());
        car.drive(190);
        System.out.println(car.toString());
        car.addFuel(20);
        System.out.println(car.toString());
        car.drive(500);
        System.out.println(car.toString());
    }

}
//needs to be mutable ?, galsInTank changes, xdelta changes. !
class Car {
    private double maxGallons;
    private double milesPerGal;
    private double x; //x in miles origin
    private double xdelta; //new position
    private double galsInTank; // gallons in tank
    public Car(double mpg, double x,double gal, double max) {
        this.milesPerGal = mpg;
        this.x = x;
        this.xdelta = 0.0;
        this.galsInTank = gal;
        this.maxGallons = max;
    }
    public void addFuel(double gals){
        this.galsInTank = this.galsInTank + gals;
        if (this.galsInTank > this.maxGallons) this.galsInTank = this.maxGallons;
    }
    public double getFuel() { return this.galsInTank;}
    private double currentRange() {
       return  milesPerGal * galsInTank;
    }
    public double getDistanceTravelled() { return this.xdelta;}
    public double newPosition() { return this.x + this.xdelta;}
    public boolean drive(double miles) {
        if( currentRange() < miles) return false;
            this.xdelta = this.xdelta + miles;
            double rangeRemain = currentRange() - miles;
            this.galsInTank = rangeRemain / this.milesPerGal;
            return true;
    }
    public String toString() {
        return String.format("origin=%f, distance travelled =%f, galsInTank=%f, range=%f, newPosition =%f",this.x,this.xdelta,this.galsInTank,currentRange(),newPosition());
    }
}
