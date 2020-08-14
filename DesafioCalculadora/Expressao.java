import java.util.ArrayList;
class Expressao {
	ArrayList<Operando> operandos = new ArrayList<Operando>();
	ArrayList<Operador> operadores = new ArrayList<Operador>();

	void addOperador(Operador sinal){
		operadores.add(sinal);
	}

	void addOperando(Operando valor){
		operandos.add(valor);
	}

	void delOperador(){
		operadores.remove(0);
	}

	void delOperando(){
		operandos.remove(0);
	}

	Operando calcular() {
		ArrayList<Operando> newOperandos = new ArrayList<Operando>();
		ArrayList<Operador> newOperadores = new ArrayList<Operador>();
		newOperandos.addAll(operandos);
		newOperadores.addAll(operadores);

		Operando resultado = new Operando(0);
		Operando resposta = new Operando(0);
		Soma soma = new Soma();
		Subt subt = new Subt();
		// for (int i = 0; i < newOperandos.size() - 1; ++i) {
		while (newOperandos.size() > 1) {

			if (newOperadores.get(0).getValor() == "+") {	
				resposta.setValor(soma.operar(newOperandos.get(0), newOperandos.get(1)));
			}
			else { //newOperadores.get(0).getValor() == "-"
				resposta.setValor(subt.operar(newOperandos.get(0), newOperandos.get(1)));
			}

			newOperandos.remove(0); // Retira o primeiro
			newOperandos.set(0, resposta); // Armazena o resultado no segundo, que vira o primeiro da próxima iteração
			newOperadores.remove(0); // Retira operador da operação
			this.toString();	

		}
		return resposta;
	}

	@Override
  	public String toString() {
    	String elementosString = "";

		for (int i = 0; i < operandos.size() - 1; ++i) {
			elementosString += this.operandos.get(i).toString();
			elementosString += this.operadores.get(i).toString();
		}		

		elementosString += this.operandos.get(operandos.size()-1).toString();
		return elementosString;
  	}
}