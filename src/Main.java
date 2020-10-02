import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int birthYear = scanner.nextInt();



            System.out.println("Enter your name, please: ");


            scanner.nextLine();
            String response = scanner.nextLine();

            int age = 2020 - birthYear;
            if(age >= 0 && age <= 100) {
                System.out.println("Hello, " + response + " you are "  + age);
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Invalid year of birth.");
        }
        scanner.close();
    }
}
