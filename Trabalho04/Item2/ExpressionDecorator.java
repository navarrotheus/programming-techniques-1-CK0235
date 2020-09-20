public class ExpressionDecorator implements Expression {
  private Expression expression;

  public ExpressionDecorator(Expression expression) {
    this.expression = expression;
  }

  public Double operation() {
    return expression.operation();
  }
}
