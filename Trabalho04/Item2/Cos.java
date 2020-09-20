public class Cos extends ExpressionDecorator {

  private Double value;

  public Cos(Expression expression, Double value) {
    super(expression);
    this.value = value;
  }

  public Double operation() {
    return super.operation() + Math.cos(value);
  }
}
