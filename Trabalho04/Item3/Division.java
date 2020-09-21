public class Division extends Operation {

  public Division(Integer x, Integer y) {
    super(x, y);
  }

  public Integer execute() {
    return x / y;
  }
}
