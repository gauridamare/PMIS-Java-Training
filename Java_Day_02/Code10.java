
package Java_Day_02;

import java.util.Scanner;

public class Code10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Square");
                System.out.print("Enter side of square: ");
                int side = sc.nextInt();

                int area = side * side;

                System.out.println("Area of Square: " + area);
                break;

            case 2:
                System.out.println("Triangle");
                System.out.print("Enter base of triangle: ");
                int base = sc.nextInt();

                System.out.print("Enter height of triangle: ");
                int height = sc.nextInt();

                int area1 = (base * height) / 2;

                System.out.println("Area of Triangle: " + area1);
                break;

            case 3:
                System.out.println("Rectangle");
                System.out.print("Enter length of rectangle: ");
                int length = sc.nextInt();

                System.out.print("Enter width of rectangle: ");
                int breadth = sc.nextInt();

                int area2 = length * breadth;

                System.out.println("Area of Rectangle: " + area2);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
