import java.util.ArrayList;

public class arraylist {
     public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Shift");
    cars.add("BMW");
    cars.add("For");
    cars.add("thar");
    System.out.println(cars);
    System.out.println(cars.get(2));
   cars.set(0, "Opel");
   System.out.println(cars);
    cars.remove(0);
    System.out.println(cars);
    System.out.println(cars.size());
    cars.clear();
     System.out.println(cars);


  }
}
    

