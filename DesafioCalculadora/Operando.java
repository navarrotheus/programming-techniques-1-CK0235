public class Operando {
	private int valor;

	public Operando(int valor) {
		setValor(valor);
	}	

	void setValor(int valor) {
		// if (valor instanceof Integer || valor instanceof Float || valor instanceof Double) {
		this.valor = valor;
		// }
		// else {
		// 	System.out.println("Tipo fudido");
		// }
	}

	void setValor(Operando o) {
		this.valor = o.getValor();
	}

	int getValor(){
		return this.valor;
	}

	@Override
	public String toString() {
		return this.valor + "";
	}
}