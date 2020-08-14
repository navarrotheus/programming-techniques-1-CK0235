class Operador {
	String valor;

	Operador(String valor) {
		setValor(valor);
	}	

	void setValor(String valor) {
		if (valor == "+" || valor == "-") {
			this.valor = valor;
		}
	}

	void setValor(Operador x) {
		this.valor = x.getValor();
	}

	String getValor(){
		return this.valor;
	}

	@Override
	public String toString(){
		return this.valor;
	}
}