 import java.util .*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> cars = new ArrayList<>();
        names.add("john");
        names.add("alex");
        cars.add("BMW");
        cars.add("verna");
        System.out.println(names);
        names = (ArrayList<String>) cars.clone(); // Corrected cast
        System.out.println(names);
    }
}
