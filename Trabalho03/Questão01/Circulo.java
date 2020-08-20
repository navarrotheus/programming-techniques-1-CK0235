class Circulo extends Figura {
  private float raio;

  Circulo(float raio, Ponto origem) {
    super(origem);
    this.raio = raio;
  }

  void mover(float dx, float dy) {
    this.origem.setX(dx); 
    this.origem.setY(dy);
  };

  float calcularArea() {
    return (this.raio * this.raio) * 3.14;
  }

  void desenhar() {
    System.out.print(this.toString());
  }
}