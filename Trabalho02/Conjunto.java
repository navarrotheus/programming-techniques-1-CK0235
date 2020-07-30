class Conjunto {
  private int[] elementos;
  private int ultimoElemento;

  Conjunto(){
    this.setElementos(new int[50]);
    this.setUltimoElemento(0);
  }

  void setElementos(int[] elementos) {
    this.elementos = elementos;
  }

  int[] getElementos() {
    return this.elementos;
  }

  void setUltimoElemento(int ultimoElemento) {
    this.ultimoElemento = ultimoElemento;
  }

  int getUltimoElemento() {
    return this.ultimoElemento;
  }

  void printElementos() {
    for (int i = 0; i < ultimoElemento; i++) {  
      System.out.print(this.elementos[i] + " ");  
    }
    System.out.print("\n");
  }

  void push(int elemento) {
    int ultimoElemento = this.getUltimoElemento();
    int[] elementos = this.getElementos();

    this.checkExists(elemento);

    if (ultimoElemento >= elementos.length) {
      int[] elementosAumentado = new int[elementos.length * 2];
      this.elementos = this.copyElements(elementosAumentado, elementos);
    }

    this.elementos[ultimoElemento] = elemento;
    this.ultimoElemento += 1;
  }

  // Copiar arr2 para arr1
  private int[] copyElements(int[] arr1, int[] arr2) {
    if (arr1.length < arr2.length) {
      throw new IllegalArgumentException("Arr1 < arr2");
    }

    for (int i = 0; i < arr2.length; i++) {  
      arr1[i] = arr2[i];
    }

    return arr1;
  }

  void checkExists(int elemento) {
    for (int i = 0; i < this.elementos.length; i++) {  
      if (this.elementos[i] == elemento) {
        throw new IllegalArgumentException("Elemento já existe no conjunto");
      }  
    }
  }

  boolean checkIsSubConjunto(Conjunto conjuntoB) {
    int[] elementosConjuntoB = conjuntoB.getElementos();
    boolean isSubconjunto = false;

    for (int i = 0; i < elementosConjuntoB.length; i++) {
      for (int j = 0; j < this.elementos.length; j++) {
        if (elementosConjuntoB[i] == this.elementos[j]) {
          isSubconjunto = true;
        }
      }

      if (!isSubconjunto) {
        return false;
      }

      isSubconjunto = false;
    }

    return true;
  }
}