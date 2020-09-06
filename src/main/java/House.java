import java.util.Objects;

public class House implements Comparable<House>{
  private Window window;
  private String wall;
  private String door;
  private Integer builtYear;


  public House(Window window, String wall, String door, Integer builtYear) {
    this.window = window;
    this.wall = wall;
    this.door = door;
    this.builtYear = builtYear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    House house = (House) o;
    return Objects.equals(window, house.window) &&
        Objects.equals(wall, house.wall) &&
        Objects.equals(door, house.door) &&
        Objects.equals(builtYear, house.builtYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(window, wall, door, builtYear);
  }

  @Override
  public String toString() {
    return "House{" +
        "window='" + window + '\'' +
        ", wall='" + wall + '\'' +
        ", door='" + door + '\'' +
        ", year=" + builtYear +
        '}';
  }

  @Override
  public int compareTo(House o) {
    return builtYear - o.builtYear;
  }

  public int getBuiltYear() {
    return builtYear;
  }
}