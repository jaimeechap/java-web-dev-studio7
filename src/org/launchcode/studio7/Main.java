package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("Hey There", 700, 350, "CD-R");

        DVD dvd = new DVD("Best Movie", 5000, 3000, "DVD-RW");


        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(300));
        System.out.println(dvd.writeData(131314));

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
