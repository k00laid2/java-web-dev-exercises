package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the length of the rectangle..");
        Integer length = Integer.valueOf(input.nextLine());
        System.out.println("Give me the width of the rectangle..");
        Integer width = Integer.valueOf(input.nextLine());
        int area = length*width;
        System.out.println("The area is " + area);
    }
}
