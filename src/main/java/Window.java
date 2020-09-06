public class Window {
  private String frame;
  private int lenght;
  private int width;

  public Window(String frame, int lenght, int width){
    this.frame=frame;
    this.lenght=lenght;
    this.width=width;
  }

  @Override
  public String toString() {
    return "Window{" +
        "frame='" + frame + '\'' +
        ", lenght=" + lenght +
        ", width=" + width +
        '}';
  }
}