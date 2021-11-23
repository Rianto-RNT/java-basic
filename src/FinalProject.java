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
        System.out.println("Are you Hungry? Yes or No :");
        String ans1 = scan.next();

        if (ans1.equals("Yes")) {
            System.out.println("Chose what you want to eat: Nasi Padang, Nasi Balap, or Sepat");
            String ans2 = scan.next();

            while
            (!ans2.equals("Nasi Padang") && !ans2.equals("Nasi Balap") && !ans2.equals("Sepat")) {
                System.out.println("Sorry we dont have it! What would you like between: Nasi Padang, Nasi Balap, and Sepat");
                ans2 = scan.next();
            }

            if (ans2.equals("Nasi Padang") || ans2.equals("Nasi Balap") || ans2.equals("Sepat")) {
                System.out.println("do you want something to drink? Yes or No :");
                String ans3 = scan.next();

                while (!ans3.equals("Yes") && !ans3.equals("No")) {
                    System.out.println("Wrong command. Please try again: ");
                    ans3 = scan.next();
                }

                if (ans3.equals("Yes")) {
                    System.out.println("What would like to drink: Coke or Juice ?");
                    String ans4 = scan.next();

                    while (!ans4.equals("Coke") && !ans4.equals("Juice")) {
                        System.out.println("Sorry we don't have it! What would you like between: Coke or Juice? ");
                        ans4 = scan.next();
                    }

                    if (ans4.equals("Coke") || ans4.equals("Juice")) {
                        System.out.println("Great, You have ordered." + ans2 + "and" + ans4);
                    }

                    System.out.println("Please confirm your password");
                    pass = scan.next();

                    while (!pass.equals(pass1)) {
                        System.out.println("This is not the right password. please try again.");
                        pass = scan.next();
                    }
                    System.out.println("Thank You. Your order is in way.");


                }

            }


        } else {
            System.out.println("Alright. Have a good day");
        }

    }
}
