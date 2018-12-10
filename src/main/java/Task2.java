import java.util.Scanner;


public class Task2 { //Create array with 10 numbers and display them in reverted order
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers separated by spaces and press Enter");
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.println();
        for (int i =10 - 1; i >=0; i--)
            System.out.println(array[i]);
    }
}
