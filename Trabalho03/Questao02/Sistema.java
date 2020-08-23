import java.util.ArrayList;

class Sistema {
  ArrayList<ContaXPTO> contas = new ArrayList<ContaXPTO>();

  void creditar(int index, double credito) {
    contas.get(index).creditar(credito);
  }

  void debitar(int index, double debito) {
    contas.get(index).debitar(debito);
  }

  double consultarSaldo(int index) {
    return contas.get(index).getSaldo();
  }

  void criarContaXPTOBasic() {
    ContaXPTOBasic conta = new ContaXPTOBasic();
    contas.add(conta);
  }

  void criarContaXPTOPlus() {
    ContaXPTOPlus conta = new ContaXPTOPlus();
    contas.add(conta);
  }

  void criarContaXPTOExtreme() {
    ContaXPTOExtreme conta = new ContaXPTOExtreme();
    contas.add(conta);
  }
}