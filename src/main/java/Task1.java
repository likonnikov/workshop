import java.util.Scanner;


public class Task1 { //Create a program to display the user name and his age in one line

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name and press Enter");
        String name = scan.nextLine();

        System.out.println("Type your age and press Enter");
        int age = scan.nextInt();

        System.out.println("My name is " + name + " and I am " + age + "!");
        scan.close();
    }
}