abstract public class Operation {
  protected Integer x;
  protected Integer y;

  public Operation(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }

  abstract Integer execute();

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
