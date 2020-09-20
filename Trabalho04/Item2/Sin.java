public class Sin extends ExpressionDecorator {

  private Double value;

  public Sin(Expression expression, Double value) {
    super(expression);
    this.value = value;
  }

  public Double operation() {
    return super.operation() + Math.sin(value);
  }
}
