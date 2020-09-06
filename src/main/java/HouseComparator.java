import java.util.Comparator;

public class HouseComparator implements Comparator<House> {

  @Override
  public int compare(House o1, House o2) {
    if (o1.getBuiltYear() == o2.getBuiltYear()) {
      return 0;
    }
    if (o1.getBuiltYear() > o2.getBuiltYear()) {
      return -1;
    } else {
      return 1;
    }
  }
}