/**
 * As classes "Multiplication" e "Division" sao as folhas
 * A interface "Operation" é o Component
 * A classe "Expression" é o Composite
 */

public class Main {
  public static void main(String[] args) {
    Operation multiplication1 = new Multiplication(1, 4);
    Operation multiplication2 = new Multiplication(5, 8);
    Operation division1 = new Division(6, 3);
    Operation division2 = new Division(12, 4);

    Expression expression = new Expression();

    expression.addOperation(multiplication1);
    expression.addOperation(multiplication2);
    expression.addOperation(division1);
    expression.addOperation(division2);

    expression.execute();
  }
}
