public class Multiplication extends Operation {

  public Multiplication(Integer x, Integer y) {
    super(x, y);
  }

  public Integer execute() {
    return x * y;
  }
}
