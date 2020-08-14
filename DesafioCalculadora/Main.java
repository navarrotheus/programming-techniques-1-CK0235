/*
Crie um programa Java que permita representar uma expressão matemática contendo somente operações de soma e diferença (e.g. "3 + 4 - 5"). Este programa deve representar cada elemento da expressão (operando e operadores) como objeto e permitir a construção de expressões matemáticas de qualquer tamanho. A expressão criada deve poder ser computada após a sua criação. Utilize os conceitos de herança e polimorfismo na solução desse problema.
*/

class Main {
  public static void main(String[] args) {
	  Operando op = new Operando(10);
	  Operando op2 = new Operando(8);
	  Operando op3 = new Operando(5);
	  Operando op4 = new Operando(3);
	  Operador soma = new Operador("+");
	  Operador sub = new Operador("-");

	  Expressao exp = new Expressao();
	  exp.addOperando(op);
	  exp.addOperador(soma);
	  exp.addOperando(op2);
	  exp.addOperador(soma);
	  exp.addOperando(op3);
	  exp.addOperador(sub);
	  exp.addOperando(op4);
	  System.out.println(exp.toString());
	  System.out.println(exp.calcular().toString());

  }
}