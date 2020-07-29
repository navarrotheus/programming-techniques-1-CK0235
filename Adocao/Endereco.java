public class Endereco {
  private String rua;
  private String numero;
  private String bairro;

  Endereco(String rua, String numero, String bairro) {
    this.setRua(rua);
    this.setNumero(numero);
    this.setBairro(bairro);
  }

  void setRua(String rua) {
    this.rua = rua;
  }

  String getRua() {
    return this.rua;
  }

  void setNumero(String numero) {
    this.numero = numero;
  }

  String getNumero() {
    return this.numero;
  }

  void setBairro(String bairro) {
    this.bairro = bairro;
  }

  String getBairro() {
    return this.bairro;
  }

  String getInfo() {
    return this.rua + ", " + this.numero + " - " + this.bairro;
  }
}