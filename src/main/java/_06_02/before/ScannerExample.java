package _06_02.before;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Enter age");
        // next int wont read \n line, hence one more nextLine is needed
        int age = scanner.nextInt();
        System.out.println(age);
        scanner.nextLine();

        System.out.println("Enter occupation");
        String occupation = scanner.nextLine();
        System.out.println(occupation);
    }

}
