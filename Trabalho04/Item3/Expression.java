import java.util.ArrayList;
import java.util.List;

public class Expression implements ExpressionSubject {
  private List<Operation> operations = new ArrayList<>();
  private List<Observer> observers = new ArrayList<>();

  public void attach(Observer observer) {
    this.observers.add(observer);
  }

  public void detach(Observer observer) {
    this.observers.remove(observer);
  }

  public void addOperation(Operation operation) {
    this.operations.add(operation);
    for (Observer observer : this.observers) {
      observer.update(operation);
    }
  }
}