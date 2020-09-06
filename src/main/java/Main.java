import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Window window1 = new Window("standart1", 1000, 300);
    Window window2 = new Window("standart2", 1500, 400);

    House house1 = new House(window1, "brick", "plastic",  2000);
    House house2 = new House(window2, "brick", "wooden",  1980);
    House house3 = new House(window1, "brick", "plastic",  2000);
    House house4 = new House(window2, "brick", "wooden",  1980);

    System.out.println(house1.equals(house2));
    System.out.println(house1.equals(house3));
    System.out.println(house3.equals(house2));
    System.out.println(house3.equals(house4));

    System.out.println();

    System.out.println("HashCode house1 = " + house1.hashCode());
    System.out.println("HashCode house2 = " + house2.hashCode());
    System.out.println("HashCode house3 = " + house3.hashCode());
    System.out.println("HashCode house4 = " + house4.hashCode());

    System.out.println();

    //using Map
    System.out.println("using Map:");

    Map<House, Integer> map = new TreeMap<>(new HouseComparator());
    map.put(house1, 1);
    map.put(house2, 1);
    map.put(house3, 1);
    map.put(house4, 1);

    for (Map.Entry<House, Integer> houseIntegerEntry : map.entrySet()) {
      System.out.println(houseIntegerEntry.getKey());
    }

    System.out.println();

// using ArrayList
    System.out.println("using ArrayList:");

    ArrayList<House> listHome = new ArrayList<>();
    listHome.add(house1);
    listHome.add(house2);
    listHome.add(house3);
    listHome.add(house4);
    listHome.sort(House::compareTo);

    for (House house : listHome){
      System.out.println(house);
    }
  }
}