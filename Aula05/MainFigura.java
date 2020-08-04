public class MainFigura {
  public static void main (String args[]) {
    Figura vetFigura[] = new Figura [100];

    vetFigura[0] = new Retangulo(2, 4, new Ponto(1, 5));
    vetFigura[1] = new Triangulo(2, 4, 6, 7, 8, new Ponto(1, 5));
    vetFigura[2] = new Circulo(5, new Ponto(1, 5));

    System.out.println(vetFigura[0].area());
    System.out.println(vetFigura[1].area());
    System.out.println(vetFigura[2].area());

    // for (int i=0; i < 3; i++) {
    //   System.out.println(vetFigura[i].getBase());
    // }

  }
}


// 1. Criar os metodos construtores das classes
// 2. Criar os metodos set/get das classes
// 3. Testar a criacao de instancias na classe MainFigura
// 4. Implementar a classe Circulo

class Ponto {
  int x, y;

  Ponto(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  void setX(int x) {
    this.x = x;
  }
  
  int getX() {
    return this.x;
  } 

  void setY(int y) {
    this.y = y;
  } 

  int getY() {
    return this.y;
  } 
}

class Figura {
  Ponto origem;

  Figura(Ponto origem) {
    this.setOrigem(origem);
  }
  
  float area () {
    System.out.println("Figura - Area");
    return 0;
  }

  float perimetro () {
    return 0;
  }

  void setOrigem(Ponto origem) {
    this.origem = origem;
  }

  Ponto getOrigem() {
    return this.origem;
  }
}

class Retangulo extends Figura {
  int base, altura;

  Retangulo(int base, int altura, Ponto origem) {
    super(origem);
    this.setBase(base);
    this.setAltura(altura);
  }

  void setBase(int base) {
    this.base = base;
  }

  int getBase() {
    return this.base;
  }

  void setAltura(int altura) {
    this.altura = altura;
  }

  int getAltura() {
    return this.altura;
  }

  float area () {
    System.out.println("Retangulo - Area");
    return base * altura;
  }

  float perimetro () {
    return (2*base)+(2*altura);
  }
}

class Triangulo extends Figura {
  int base, altura;
  int lado1, lado2, lado3;

  Triangulo(int base, int altura, int lado1, int lado2, int lado3, Ponto origem) {
    super(origem);
    this.setLado1(lado1);
    this.setLado2(lado2);
    this.setLado3(lado3);
    this.setBase(base);
    this.setAltura(altura);
  }

  void setBase(int base) {
    this.base = base;
  }

  int getBase() {
    return this.base;
  }

  void setAltura(int altura) {
    this.altura = altura;
  }

  int getAltura() {
    return this.altura;
  }

  void setLado1(int lado1) {
    this.lado1 = lado1;
  }

  int getLado1() {
    return this.lado1;
  }

  void setLado2(int lado2) {
    this.lado2 = lado2;
  }

  int getLado2() {
    return this.lado2;
  }

  void setLado3(int lado3) {
    this.lado3 = lado3;
  }

  int getLado3() {
    return this.lado3;
  }
  
  float area () {
    System.out.println("Triangulo - Area");
    return (base*altura)/2;
  }

  float perimetro () {
    return (lado1+lado2+lado3);
  }
}

class Circulo extends Figura {
  int raio;

  Circulo(int raio, Ponto origem) {
    super(origem);
    this.setRaio(raio);
  }

  float area() {
    System.out.println("Figura - Circulo");
    return (this.raio * this.raio) * 3;
  }

  void setRaio(int raio) {
    this.raio = raio;
  }

  int getRaio() {
    return this.raio;
  }
}

