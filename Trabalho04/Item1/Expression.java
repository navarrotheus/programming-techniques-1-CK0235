import java.util.ArrayList;
import java.util.List;

public class Expression implements Operation {
  private List<Operation> operations;

  public Expression() {
    this.operations = new ArrayList<>();
  }

  public void execute() {
    for (Operation operation : operations) {
      operation.execute();
    }
  }

  public void addOperation(Operation operation) {
    this.operations.add(operation);
  }

  public void removeOperation(Operation operation) {
    this.operations.remove(operation);
  }

  public Operation getOperation(int index) {
    return this.operations.get(index);
  }
}
