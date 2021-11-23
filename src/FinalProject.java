import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        System.out.println("Hi, Welcome to the food app");
        System.out.println("Please create a password");

        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();

        System.out.println("your password is now:" + pass1);
        System.out.println("Please enter your password:");

        String pass = scan.next();

        while (!pass.equals(pass1)) {
            System.out.println("This is not the right password. please try again.");
            pass = scan.next();
        }

        System.out.println("Access Granted");

    }
}
