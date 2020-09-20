public class Division implements Operation {
  private Integer x;
  private Integer y;

  public void execute() {
    System.out.println(x + " dividido por " + y + " = " + x/y);
  }

  public Division(Integer x, Integer y) {
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
