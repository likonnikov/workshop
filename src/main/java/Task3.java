import java.util.Scanner;


public class Task3 { //Create array for 20 numbers and display it as 2 arrays with even only and odd only numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[20];
        System.out.println("Type 20 numbers separated by spaces and press Enter");
        for (int i = 0; i < 20; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("\n==========");
        System.out.println("Even numbers:");
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
        System.out.println("\n==========");
        System.out.println("Odd numbers:");
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
