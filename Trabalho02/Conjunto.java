class Conjunto<T> {
  private Object[] elementos;
  private int ultimoElemento;

  Conjunto(){
    this.setElementos(new Object[50]);
    this.setUltimoElemento(0);
  }

  void setElementos(Object[] elementos) {
    this.elementos = elementos;
  }

  Object[] getElementos() {
    return this.elementos;
  }

  void setUltimoElemento(int ultimoElemento) {
    this.ultimoElemento = ultimoElemento;
  }

  int getUltimoElemento() {
    return this.ultimoElemento;
  }

  void push(T elemento) {
    int ultimoElemento = this.getUltimoElemento();
    Object[] elementos = this.getElementos();

    if (this.checkExists(elemento)) {
      return;
    } 

    if (ultimoElemento >= elementos.length) {
      Object[] elementosAumentado = new Object[elementos.length * 2];
      this.elementos = this.copyElements(elementosAumentado, elementos);
    }

    this.elementos[ultimoElemento] = elemento;
    this.ultimoElemento += 1;
  }

  // Copiar arr2 para arr1
  private Object[] copyElements(Object[] arr1, Object[] arr2) {
    if (arr1.length < arr2.length) {
      throw new IllegalArgumentException("Arr1 < arr2");
    }

    for (int i = 0; i < arr2.length; i++) {  
      arr1[i] = arr2[i];
    }

    return arr1;
  }

  void troca(int i, int j) {
    final T aux = (T)this.elementos[i];
    this.elementos[i] = this.elementos[j];
    this.elementos[j] = aux;
  }

  void remove(T elemento) {
    for (int i = 0; i < this.ultimoElemento; i++) {  
      if (this.elementos[i].equals(elemento)) {
        this.elementos[i] = this.elementos[this.ultimoElemento - 1];
        this.ultimoElemento = this.ultimoElemento - 1;

        return;
      }  
    }
  }

  boolean checkExists(T elemento) {
    for (int i = 0; i < this.getUltimoElemento(); i++) {  
      if (this.elementos[i].equals(elemento)) {
        return true;
      }  
    }

    return false;
  }

  boolean checkIsSubConjunto(Conjunto conjuntoB) {
    Object[] elementosConjuntoB = conjuntoB.getElementos();
    boolean isSubconjunto = false;

    for (int i = 0; i < conjuntoB.getUltimoElemento(); i++) {
      for (int j = 0; j < this.getUltimoElemento(); j++) {
        if (elementosConjuntoB[i].equals(this.elementos[j])) {
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
    Conjunto copiaConjuntoB = this.copiaConjunto(conjuntoB);

    for (int i = 0; i < this.getUltimoElemento(); i++) {
      copiaConjuntoB.remove(this.elementos[i]);

      conjuntoC.push(this.elementos[i]);
    }

    for (int i = 0; i < copiaConjuntoB.getUltimoElemento(); i++) {
      conjuntoC.push(copiaConjuntoB.getElementos()[i]);
    }

    return conjuntoC;
  }

  Conjunto interseccaoConjunto(Conjunto conjuntoB) {
    Conjunto conjuntoC = new Conjunto();

    Conjunto copiaConjuntoB = this.copiaConjunto(conjuntoB);
    Object[] elementosB = copiaConjuntoB.getElementos();

    for (int i = 0; i < this.getUltimoElemento(); i++) {
      if(this.checkExists((T)elementosB[i])) {
        conjuntoC.push(elementosB[i]);
      }
    }
    return conjuntoC;
  }

  Conjunto diferencaConjunto(Conjunto conjuntoB) {
    Conjunto conjuntoC = new Conjunto();

    Conjunto copiaConjuntoB = this.copiaConjunto(conjuntoB);
    Object[] elementosB = copiaConjuntoB.getElementos();

    for (int i = 0; i < this.getUltimoElemento(); i++) {
      if(!copiaConjuntoB.checkExists(this.elementos[i])) {
        conjuntoC.push(this.elementos[i]);
      }
    }
    return conjuntoC;
  }

  Conjunto produtoCartesiano(Conjunto conjuntoB) {
    Conjunto produtoCartesiano = new Conjunto<Par>();

    Conjunto copiaConjuntoB = this.copiaConjunto(conjuntoB);
    Object[] elementosB = copiaConjuntoB.getElementos();

    for (int i = 0; i < this.getUltimoElemento(); i++) {
      for (int j = 0; j < copiaConjuntoB.getUltimoElemento(); j++) {
        produtoCartesiano.push(new Par<T>((T)this.elementos[i], (T)elementosB[j]));
      }
    }
    return produtoCartesiano;
  }

  Conjunto conjuntoPotencia() {
    Conjunto conjuntoPotencia = new Conjunto<Conjunto<T>>();

    conjuntoPotencia.push(new Conjunto<T>());
    
    Conjunto subConjuntoTodos = new Conjunto<T>();

    for (int i = 0; i < this.getUltimoElemento(); i++) {
      Conjunto subConjuntoElemento = new Conjunto<T>();
      subConjuntoElemento.push((T)this.elementos[i]);
      conjuntoPotencia.push(subConjuntoElemento);

      subConjuntoTodos.push((T)this.elementos[i]);

      for (int j = i; j < this.getUltimoElemento(); j++) {
        Conjunto subConjuntoDupla = new Conjunto<T>();
        subConjuntoDupla.push((T)this.elementos[i]);
        subConjuntoDupla.push((T)this.elementos[j]);
        conjuntoPotencia.push(subConjuntoDupla);
      }
    }

    conjuntoPotencia.push(subConjuntoTodos);


    return conjuntoPotencia;
  }

  Conjunto copiaConjunto(Conjunto conjunto) {
    Conjunto copia = new Conjunto();

    for (int i = 0; i < conjunto.getUltimoElemento(); i++) {
      copia.push(conjunto.getElementos()[i]);
    }

    return copia;
  }

  @Override
  public String toString() {
    String elementosString = "{ ";
    int ultimoElemento = this.getUltimoElemento();

    for (int i = 0; i < ultimoElemento - 1; i++) {
      elementosString = elementosString + this.elementos[i] + ", " ;
    }

    if (ultimoElemento > 0) {
      elementosString = elementosString + this.elementos[ultimoElemento - 1] + " }";
    } else {
      elementosString = elementosString + " }";
    }

    return elementosString;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() != this.getClass()) {
      return false;
    }

    if (obj == null) {
      return false;
    }

    final Conjunto conjuntoB = (Conjunto) obj;

    int ultimoElementoA = this.getUltimoElemento();
    int ultimoElementoB = conjuntoB.getUltimoElemento();
    Object[] elementosB = conjuntoB.getElementos();

    if (ultimoElementoA != ultimoElementoB) {
      return false;
    }

    for (int i = 0; i < ultimoElementoA; i++) {
      if (!this.checkExists((T)elementosB[i])) {
        return false;
      }
    }

    return true;
  }
}