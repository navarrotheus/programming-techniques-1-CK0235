class Main {
  public static void main (String args[]) {
    Conjunto conjuntoA = new Conjunto<Integer>();

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
    System.out.print("\n");
    
    // Tipo string

    Conjunto conjuntoString = new Conjunto<String>();

    conjuntoString.push("a");
    conjuntoString.push("b");
    conjuntoString.push("c");

    Conjunto produtoCartesiano1com2 = conjunto1.produtoCartesiano(conjunto2);
    System.out.print("Produto cartesiano do conjunto 1 com conjunto 2: \n");
    produtoCartesiano1com2.printElementos();
    System.out.print("\n");

    System.out.print("Conjunto String: \n");
    conjuntoString.printElementos();
    System.out.print("\n");

    

    System.out.print("Lei de Morgan: \n");
    System.out.print("Conjunto A: \n");
    System.out.print(conjuntoA.toString());
    System.out.print("\n \n");

    System.out.print("Conjunto B: \n");
    System.out.print(conjuntoB.toString());
    System.out.print("\n \n");

    System.out.print("Conjunto universo U: \n");
    Conjunto conjuntoU = new Conjunto<Integer>();
    conjuntoU.push(1);
    conjuntoU.push(2);
    conjuntoU.push(3);
    conjuntoU.push(4);
    conjuntoU.push(5);
    conjuntoU.push(6);
    conjuntoU.push(7);
    conjuntoU.push(8);
    conjuntoU.push(9);
    conjuntoU.push(10);
    conjuntoU.push(11);
    conjuntoU.push(12);
    conjuntoU.push(13);
    conjuntoU.push(14);
    conjuntoU.push(15);
    conjuntoU.push(16);
    conjuntoU.push(17);
    conjuntoU.push(18);
    conjuntoU.push(19);
    conjuntoU.push(20);
    conjuntoU.push(21);
    conjuntoU.push(22);
    conjuntoU.push(23);
    conjuntoU.push(24);
    conjuntoU.push(25);
    conjuntoU.push(26);
    conjuntoU.push(27);
    conjuntoU.push(28);
    conjuntoU.push(29);
    conjuntoU.push(30);
    conjuntoU.push(31);
    conjuntoU.push(32);
    conjuntoU.push(33);
    conjuntoU.push(34);
    conjuntoU.push(35);
    conjuntoU.push(36);
    conjuntoU.push(37);
    conjuntoU.push(38);
    conjuntoU.push(39);
    conjuntoU.push(40);
    conjuntoU.push(41);
    conjuntoU.push(42);
    conjuntoU.push(43);
    conjuntoU.push(44);
    conjuntoU.push(45);
    conjuntoU.push(46);
    conjuntoU.push(47);
    conjuntoU.push(48);
    conjuntoU.push(49);
    conjuntoU.push(50);
    System.out.print(conjuntoU.toString());
    System.out.print("\n \n");

    System.out.print("Complementar de A: \n");
    Conjunto complementarA = conjuntoU.diferencaConjunto(conjuntoA);
    System.out.print(complementarA.toString());
    System.out.print("\n \n");

    System.out.print("Complementar de B: \n");
    Conjunto complementarB = conjuntoU.diferencaConjunto(conjuntoB);
    System.out.print(complementarB.toString());
    System.out.print("\n \n");

    System.out.print("Uniao A com B: \n");
    System.out.print(conjuntoC.toString());
    System.out.print("\n \n");

    System.out.print("(1) Complementar da uniao de A com B: \n");
    Conjunto conjuntoCAB = conjuntoU.diferencaConjunto(conjuntoC);
    System.out.print(conjuntoCAB.toString());
    System.out.print("\n \n");

    System.out.print("(2) Interseccao do Complementar de A com Complementar de B: \n");
    Conjunto intersecCACB = complementarB.interseccaoConjunto(complementarA);
    System.out.print(intersecCACB.toString());
    System.out.print("\n \n");
    System.out.print("(1) == (2) ? " + conjuntoCAB.equals(intersecCACB));
    System.out.print("\n \n");

    System.out.print("Interseccao A com B: \n");
    System.out.print(conjuntoD.toString());
    System.out.print("\n \n");

    System.out.print("(3) Complementar da interseccao de A com B: \n");
    Conjunto complementarIntersecAB = conjuntoU.diferencaConjunto(conjuntoD);
    System.out.print(complementarIntersecAB.toString());
    System.out.print("\n \n");

    System.out.print("(4) Uniao do Complementar de A com Complementar de B: \n");
    Conjunto conjuntoUCACB = complementarB.uniaoConjunto(complementarA);
    System.out.print(conjuntoUCACB.toString());
    System.out.print("\n\n(3) == (4) ? " + conjuntoUCACB.equals(complementarIntersecAB));
    System.out.print("\n \n");

    System.out.print("Conjunto String: \n");
    System.out.print(conjuntoString.toString());
    System.out.print("\n");

    Conjunto conjuntoPotenciaString = conjuntoString.conjuntoPotencia();
    System.out.print("Conjunto potência do conjunto string: \n");
    System.out.print(conjuntoPotenciaString.toString());
    System.out.print("\n \n");


  }
}

