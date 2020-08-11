class Par<T> {
  private T x;
  private T y;

  Par(T x, T y){
    this.setX(x);
    this.setY(y);
  }

  void setX(T x) {
    this.x = x;
  }

  T getX() {
    return this.x;
  }

  void setY(T y) {
    this.y = y;
  }

  T getY() {
    return this.y;
  }

  @Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}