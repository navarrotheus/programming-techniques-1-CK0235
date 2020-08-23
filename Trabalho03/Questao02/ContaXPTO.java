abstract class ContaXPTO {
  String tipo;
  double bonus;
  double restituicao;
  double saldo;

  ContaXPTO(String tipo, double bonus, double restituicao) {
    this.setTipo(tipo);
    this.setBonus(bonus);
    this.setRestituicao(restituicao);
  }

  ContaXPTO(String tipo, double bonus, double restituicao, double saldoInicial) {
    this.setTipo(tipo);
    this.setBonus(bonus);
    this.setRestituicao(restituicao);
    this.setSaldo(saldoInicial);
  }

  void creditar(double credito) {
    double bonus = this.bonus * credito;

    this.setSaldo(this.saldo + credito + bonus);
  };

  void debitar(double debito) {
    double restituicao = this.restituicao * debito;

    this.setSaldo(this.saldo - debito + restituicao);
  };

  String getTipo() {
    return this.tipo;
  }

  double getBonus() {
    return this.bonus;
  }

  double getRestituicao() {
    return this.restituicao;
  }

  double getSaldo() {
    return this.saldo;
  }

  void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  void setTipo(String tipo) {
    this.tipo = tipo;
  }

  void setBonus(double bonus) {
    this.bonus = bonus;
  }

  void setRestituicao(double restituicao) {
    this.restituicao = restituicao;
  }

  @Override
  public String toString() {
    return "Conta " + this.tipo + " com " + bonus + " de bonus e " + restituicao + " de restituicao" ;
  }
}

class ContaXPTOBasic extends ContaXPTO {
  ContaXPTOBasic(){
    super("Basic", 0, 0);
  }

  ContaXPTOBasic(double saldoInicial){
    super("Basic", 0, 0, saldoInicial);
  }
}

class ContaXPTOPlus extends ContaXPTO {
  ContaXPTOPlus(){
    super("Plus", 0.005, 0);
  }

  ContaXPTOPlus(double saldoInicial){
    super("Plus", 0.005, 0, saldoInicial);
  }
}

class ContaXPTOExtreme extends ContaXPTO {
  ContaXPTOExtreme(){
    super("Extreme", 0.002, 0.002);
  }

  ContaXPTOExtreme(double saldoInicial){
    super("Extreme", 0.002, 0.002, saldoInicial);
  }
}