
public class Array4 {

    public static void main(String[] args) {

        int number[] = {12, 45, 7, 89, 23};

        int min = number[0];

        for (int i = 0; i < number.length; i++) {

            if (min > number[i]) {
                min = number[i];
            }
        }

        System.out.println("Minimum number is: " + min);
    }
}
