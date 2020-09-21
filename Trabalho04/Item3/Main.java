/**
 * ExpressionSubject equivale ao Subject
 * Expression equivale a implementacao do Subject
 * 
 * Observer equivale ao Observer
 * ObserverNegativoOuZero e ObserverPositivo equivale as implementacoes do Observer
 */

public class Main {
  public static void main(String[] args) {
    Expression observable = new Expression();
    ObserverNegativoOuZero observerNegativoOuZero = new ObserverNegativoOuZero();
    ObserverPositivo observerPositivo = new ObserverPositivo();

    observable.attach(observerNegativoOuZero);
    observable.attach(observerPositivo);

    observable.addOperation(new Division(4, 2));
    observable.addOperation(new Multiplication(1, -1));
  }
}
