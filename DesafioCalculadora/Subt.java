public class Subt extends Operacao {
	Operando operar(Operando a, Operando b){
		Operando resultado = new Operando(a.getValor() - b.getValor());
		return resultado;
	}
}