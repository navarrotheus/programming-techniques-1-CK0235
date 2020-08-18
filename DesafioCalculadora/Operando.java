public class Operando {
	private int valor;

	public Operando(int valor) {
		setValor(valor);
	}	

	void setValor(int valor) {
		this.valor = valor;
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