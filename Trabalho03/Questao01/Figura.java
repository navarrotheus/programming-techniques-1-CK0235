abstract class Figura {
  Ponto origem;

  Figura(Ponto origem) {
    this.origem = origem;
  }

  abstract void mover(double dx, double dy);
  abstract double calcularArea();
}