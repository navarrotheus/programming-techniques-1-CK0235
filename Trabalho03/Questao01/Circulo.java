class Circulo extends Figura {
  private double raio;

  Circulo(double raio, Ponto origem) {
    super(origem);
    this.raio = raio;
  }

  void mover(double dx, double dy) {
    this.origem.setX(dx); 
    this.origem.setY(dy);
  };

  double calcularArea() {
    return (this.raio * this.raio) * 3.14;
  }

  void desenhar() {
    System.out.print(this.toString());
  }
}