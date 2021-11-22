import java.util.Scanner;

public class SelectorPart1 {
    public static void main(String[] args) {

        System.out.println("do you want a laptop");
        Scanner scan = new Scanner(System.in);
        String Ans1 = scan.next();

        if (Ans1.equals("yes")) {
            System.out.println("what is your favorite color between red-blue-yellow");
        }
        else {
            System.out.println("no worries have a good day");
        }

    }
}
