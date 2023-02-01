package exercises.datatypes;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Integer miles = Integer.valueOf(input.nextLine());
        System.out.println("How many gallons of gas did that take?");
        Integer gallons = Integer.valueOf(input.nextLine());
        double mileage = miles / gallons;
        System.out.println("The miles per gallon is  " + mileage);
    }
}
