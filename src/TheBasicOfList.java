import java.util.ArrayList;

public class TheBasicOfList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("rambutan");
        fruits.add("manggis");
        fruits.add("water melon");
        int ListSize = fruits.size();
        String place = fruits.get(2);
        fruits.set(1, "green banana");
//        fruits.remove(0);
//        fruits.clear();

        System.out.println(ListSize);
        System.out.println(fruits);
        System.out.println(place);

    }
}
