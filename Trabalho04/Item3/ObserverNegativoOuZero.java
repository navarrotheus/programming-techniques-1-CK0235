public class ObserverNegativoOuZero implements Observer {
  @Override
  public void update(Operation operation) {
    if (operation.execute() == 0) {
      System.out.println("Operação " + operation + " deu zero!");
    } else if (operation.execute() < 0) {
      System.out.println("Operação " + operation + " deu negativo!");
    }
  } 
}