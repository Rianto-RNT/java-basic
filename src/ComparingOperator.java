public class ComparingOperator {
    public static void main(String[] args) {

        double a = 1.6;
        double b = 2.34;
        double c = 3;
        double d = 5;
        double e = 5;

        boolean FirstTry = a == b;
        boolean SecondTry = c < d;
        boolean ThirdTry = e == d;
        boolean FourthTry = e == d && c > d;

        System.out.println(FirstTry); // False
        System.out.println(SecondTry); // True
        System.out.println(ThirdTry); // True
        System.out.println(FourthTry); // False

    }
}
