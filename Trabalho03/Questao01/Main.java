class Main {
  public static void main (String args[]) {
    Figura vetor[] = new Figura[10];

    for (int i = 0; i < 5; i++) {
      vetor[i] = new Circulo(3, new Ponto(2,3));
    }

    for (int i = 5; i < 10; i++) {
      vetor[i] = new QuadradoColorido(2, new Ponto(0,0));
    }

    for (int i = 0; i < 10; i++) {
      if (vetor[i] instanceof FiguraColorida) {
        System.out.print("Area da figura colorida: " + vetor[i].calcularArea() + "\n");
      }
    }
  }
}

