public class Soma extends Operacao {
	Operando operar(Operando a, Operando b){
		int v1 = a.getValor();
		int v2 = b.getValor();
		int resposta = v1 + v2;
		Operando resultado = new Operando(resposta); 
		return (resultado);
	}
}