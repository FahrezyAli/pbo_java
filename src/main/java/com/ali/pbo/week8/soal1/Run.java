package com.ali.pbo.week8.soal1;

import com.ali.pbo.Helper;

public class Run
{
    public static void main(String[] args)
    {
        final Car car1 = new Car();
        car1.setNbOfSeats(10);
        Helper.println("Seats: " + car1.getNbOfSeats());
        car1.start();
        car1.stop();
        Helper.newLine();

        final Vehicle vehicle1 = (Vehicle) car1;
        vehicle1.start();
        vehicle1.stop();
        Helper.newLine();

        final Car car2 = (Car) vehicle1;
        Helper.println("Seats:" + car2.getNbOfSeats());
        car2.start();
        car2.stop();
    }
}
