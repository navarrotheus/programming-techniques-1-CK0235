class Quadrado extends Figura {
  private float lado;

  Quadrado(float lado, Ponto origem) {
    super(origem);
    this.lado = lado;
  }

  void mover(float dx, float dy) {
    this.origem.setX(dx); 
    this.origem.setY(dy);
  };

  float calcularArea() {
    return (this.lado * this.lado);
  }

  void desenhar() {
    System.out.print(this.toString());
  }
}