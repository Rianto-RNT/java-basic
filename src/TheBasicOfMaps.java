import java.util.HashMap;
import java.util.Map;

public class TheBasicOfMaps {
    public static void main(String[] args) {

        Map cars = new HashMap();
        cars.put("BMW", 1);
        cars.put("Toyota", 2);
        cars.put("Audi", 5);
        cars.put("Mustang", 3);
        cars.put("Ford", 7);
        cars.remove("BMW");
        int size = cars.size();

        System.out.println(cars.get("Audi"));

    }
}
