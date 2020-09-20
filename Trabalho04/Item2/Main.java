/**
 * Expression é o Component
 * ExpressionImp é o ConcreteComponent
 * ExpressionDecorator é o Decorator
 * Sin e Cos sao as implementacoes do decorator
 */
public class Main {
  public static void main(String[] args) {
    Expression expression1 = new Sin(new ExpressionImp(), 1.0);
    System.out.println(expression1.operation());
    System.out.println(expression1.operation() == Math.sin(1.0));

    Expression expression2 = new Cos(new Sin(new ExpressionImp(), 2.0), 1.0);
    System.out.println(expression2.operation());
    System.out.println(expression2.operation() == (Math.sin(2.0) + Math.cos(1.0)));
  }
}
