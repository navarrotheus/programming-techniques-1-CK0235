public class ObserverPositivo implements Observer {

  @Override
  public void update(Operation operation) {
    if (operation.execute() > 0) {
      System.out.println("Operação " + operation + " deu positivo!");
    }
  } 
}