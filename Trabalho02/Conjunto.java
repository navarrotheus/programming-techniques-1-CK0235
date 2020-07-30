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

    if (this.checkExists(elemento)) {
      throw new IllegalArgumentException("Elemento já existe no conjunto");
    } 

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

  void troca(int i, int j) {
    int aux = this.elementos[i];
    this.elementos[i] = this.elementos[j];
    this.elementos[j] = aux;
  }

  void remove(int elemento) {
    for (int i = 0; i < this.ultimoElemento; i++) {  
      if (this.elementos[i] == elemento) {
        this.elementos[i] = this.elementos[this.ultimoElemento - 1];
        this.ultimoElemento = this.ultimoElemento - 1;

        return;
      }  
    }
  }

  boolean checkExists(int elemento) {
    for (int i = 0; i < this.getUltimoElemento(); i++) {  
      if (this.elementos[i] == elemento) {
        return true;
      }  
    }

    return false;
  }

  boolean checkIsSubConjunto(Conjunto conjuntoB) {
    int[] elementosConjuntoB = conjuntoB.getElementos();
    boolean isSubconjunto = false;

    for (int i = 0; i < conjuntoB.getUltimoElemento(); i++) {
      for (int j = 0; j < this.getUltimoElemento(); j++) {
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

  Conjunto uniaoConjunto(Conjunto conjuntoB) {
    Conjunto conjuntoC = new Conjunto();

    for (int i = 0; i < this.getUltimoElemento(); i++) {
      conjuntoB.remove(this.elementos[i]);

      conjuntoC.push(this.elementos[i]);
    }

    for (int i = 0; i < conjuntoB.getUltimoElemento(); i++) {
      conjuntoC.push(conjuntoB.getElementos()[i]);
    }

    return conjuntoC;
  }
}