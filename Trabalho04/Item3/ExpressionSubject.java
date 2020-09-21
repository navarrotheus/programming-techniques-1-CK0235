public interface ExpressionSubject {
  public void attach(Observer observer);
  public void detach(Observer observer);
  public void addOperation(Operation operation);
}
