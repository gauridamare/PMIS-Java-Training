import java.util.Scanner;
public class Code01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a Number 3: ");
        int num3 = sc.nextInt();
    float avg = (num1 + num2 + num3) / 3.0f;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + avg);
        sc.close();

    }
}