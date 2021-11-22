public class DataStorage {
    public static void main(String[] args) {

        double[] Data = new double[4];
        Data[0] = 1.5;
        Data[1] = 3.34;
        Data[2] = 5;
        Data[3] = 4;

//        double A = Data[0]+Data[2];
//
//        System.out.println(A);

        String[] Data2 = new String[2];
        Data2[0] = "TUF";
        Data2[1] = "STRIX";

        if (Data[0]>Data[2]) {
            System.out.println(Data[0]+ "is grater than" + Data[2]);
        }
        else {
            System.out.println(Data[2] + " " + "is grater than "+ " "+ Data[0]);
        }

    }
}
