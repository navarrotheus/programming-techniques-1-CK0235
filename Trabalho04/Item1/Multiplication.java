public class Multiplication implements Operation {
  private Integer x;
  private Integer y;

  public void execute() {
    System.out.println(x + " multiplicado por " + y + " = " + x*y);
  }

  public Multiplication(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }

  public Integer getX() {
    return this.x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Integer getY() {
    return this.y;
  }

  public void setY(Integer y) {
    this.y = y;
  }
}
