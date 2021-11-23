import java.util.Scanner;

public class BasicTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the test");
        System.out.println("Question  1: What is 2*2 in letters");
        String ans1 = scan.next();

        while (!ans1.equals("four")) {
            System.out.println("You had the wrong answer try again What is 2*2 in letters");
            ans1 = scan.next();

        }
        System.out.println("Great. You had the right answer");

        System.out.println("Question 2: where is Lenangguar ?");
        String ans2 = scan.next();

        while (!ans2.equals("Sumbawa")) {
            System.out.println("You had the wrong answer. Please try again");
            ans2 = scan.next();
        }
        System.out.println("Great. You pass the test");
    }
}
