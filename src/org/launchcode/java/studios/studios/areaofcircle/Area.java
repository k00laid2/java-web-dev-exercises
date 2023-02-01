package org.launchcode.java.studios.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide the radius of a circle.");
        double radius = Double.parseDouble((input.nextLine()));
//        Circle.getArea(radius);
        System.out.println("The total area is  " + Circle.getArea(radius));
    }
}
