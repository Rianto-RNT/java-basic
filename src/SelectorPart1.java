import java.util.Scanner;

public class SelectorPart1 {
    public static void main(String[] args) {

        System.out.println("do you want a laptop");
        Scanner scan = new Scanner(System.in);
        String Ans1 = scan.next();

        if (Ans1.equals("yes")) {
            System.out.println("what is your favorite color between red-blue-yellow?");
            String Ans2 = scan.next();

            if (Ans2.equals("red")) {
                System.out.println("we have in stock! would you like to see it. Yes or No?");
                String Ans3 = scan.next();

                if (Ans3.equals("yes")) {
                    System.out.println("Great, let's check the laptop");
                } else {
                    System.out.println("No worries, we will check something else");
                }


            } else if (Ans2.equals("blue")) {
                System.out.println("we can order it");
            }
            else {
                System.out.println("we don't have it in stock");
            }
        }
        else {
            System.out.println("no worries have a good day");
        }

    }
}
