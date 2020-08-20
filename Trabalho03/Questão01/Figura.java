abstract class Figura {
  Ponto origem;

  abstract void desenhar();
  abstract void mover(float dx, float dy);
  abstract float calcularArea();
}