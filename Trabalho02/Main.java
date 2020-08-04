class Main {
  public static void main (String args[]) {
    Conjunto conjuntoA = new Conjunto();

    conjuntoA.push(1);
    conjuntoA.push(2);
    conjuntoA.push(3);
    conjuntoA.push(4);
    conjuntoA.push(5);
    conjuntoA.push(6);
    conjuntoA.push(7);
    conjuntoA.push(8);
    conjuntoA.push(9);
    conjuntoA.push(10);
    conjuntoA.push(11);
    conjuntoA.push(12);
    conjuntoA.push(14);

    System.out.print("Conjunto A: \n");
    conjuntoA.printElementos();
    System.out.print("\n");

    Conjunto conjuntoB = new Conjunto();
    conjuntoB.push(13);
    conjuntoB.push(14);
    conjuntoB.push(15);
    conjuntoB.push(7);
    System.out.print("Conjunto B: \n");
    conjuntoB.printElementos();
    System.out.print("\n");

    Conjunto conjuntoC = conjuntoA.uniaoConjunto(conjuntoB);
    System.out.print("Uniao A com B: \n");
    conjuntoC.printElementos();
    System.out.print("\n");

    Conjunto conjuntoD = conjuntoA.interseccaoConjunto(conjuntoB);
    System.out.print("Intersecao A com B: \n");
    conjuntoD.printElementos();
    System.out.print("\n");


    // Conjunto conjuntoE = conjuntoA.diferencaConjunto(conjuntoB);
    // conjuntoE.printElementos();
  }
}

