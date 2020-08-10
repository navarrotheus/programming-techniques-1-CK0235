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

    Conjunto conjuntoE = conjuntoA.diferencaConjunto(conjuntoB);
    System.out.print("Diferença A - B: \n");
    conjuntoE.printElementos();
    System.out.print("\n");

    System.out.print("Testes questão 12 \n \n");

    Conjunto conjunto1 = new Conjunto();
    conjunto1.push(0);
    conjunto1.push(1);
    conjunto1.push(2);
    conjunto1.push(3);
    conjunto1.push(4);
    conjunto1.push(5);
    conjunto1.push(6);
    conjunto1.push(7);
    conjunto1.push(8);
    conjunto1.push(9);
    System.out.print("Conjunto 1: \n");
    conjunto1.printElementos();
    System.out.print("\n");
    
    Conjunto conjunto2 = new Conjunto();
    conjunto2.push(0);
    conjunto2.push(2);
    conjunto2.push(4);
    conjunto2.push(6);
    conjunto2.push(8);
    System.out.print("Conjunto 2: \n");
    conjunto2.printElementos();
    System.out.print("\n");
    
    Conjunto conjunto3 = new Conjunto();
    conjunto3.push(1);
    conjunto3.push(3);
    conjunto3.push(5);
    conjunto3.push(7);
    conjunto3.push(9);
    System.out.print("Conjunto 3: \n");
    conjunto3.printElementos();
    System.out.print("\n");
    
    Conjunto conjunto4 = new Conjunto();
    conjunto4.push(2);
    conjunto4.push(3);
    conjunto4.push(5);
    conjunto4.push(7);
    conjunto4.push(11);
    conjunto4.push(13);
    conjunto4.push(17);
    conjunto4.push(19);
    conjunto4.push(23);
    conjunto4.push(29);
    System.out.print("Conjunto 4: \n");
    conjunto4.printElementos();
    System.out.print("\n");

    System.out.print("a. Se o conjunto 4 é subconjunto de si mesmo: \n");
    System.out.print(conjunto4.checkIsSubConjunto(conjunto4) + "\n \n");

    System.out.print("b. A pertinência dos conjuntos 2, 3 e 4 no conjunto 1: \n");
    System.out.print("Conjunto 2 no conjunto 1: " + conjunto1.checkIsSubConjunto(conjunto2) + "\n \n");
    System.out.print("Conjunto 3 no conjunto 1: " + conjunto1.checkIsSubConjunto(conjunto3) + "\n \n");
    System.out.print("Conjunto 4 no conjunto 1: " + conjunto1.checkIsSubConjunto(conjunto4) + "\n \n");

    System.out.print("c. Se a união de 2 e 3 é igual ao conjunto 1: \n");
    Conjunto conjunto2uniao3 = conjunto2.uniaoConjunto(conjunto3);
    System.out.print("Conjunto uniao: ");
    conjunto2uniao3.printElementos();
    System.out.print("Conjunto 1: ");
    conjunto1.printElementos();
    System.out.print("\n");

    System.out.print("d. Se a intersecção dos conjuntos 1 e 2 é vazia: \n");
    Conjunto conjunto1intersec2 = conjunto1.interseccaoConjunto(conjunto2);
    conjunto1intersec2.printElementos();
    System.out.print("\n");

    System.out.print("e. Qual diferença entre os conjuntos 1 e 2: \n");
    Conjunto diferenca1e2 = conjunto1.diferencaConjunto(conjunto2);
    diferenca1e2.printElementos();

  }
}

