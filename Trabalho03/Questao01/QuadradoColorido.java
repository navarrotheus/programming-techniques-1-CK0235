class QuadradoColorido extends Figura implements FiguraColorida {
  private double lado;
  private String cor;

  QuadradoColorido(double lado, Ponto origem) {
    super(origem);
    this.lado = lado;
  }

  void mover(double dx, double dy) {
    this.origem.setX(dx); 
    this.origem.setY(dy);
  };

  double calcularArea() {
    return (this.lado * this.lado);
  }

  public void desenhar(String cor) {
    this.cor = cor;
  }
}