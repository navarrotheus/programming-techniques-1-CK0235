public class Pet {
  private String nome;
  private String tipo;
  private double peso;

  Pet(String nome, String tipo) {
    this.setNome(nome);
    this.setTipo(tipo);
  }

  Pet(String nome, String tipo, double peso) {
    this.setNome(nome);
    this.setTipo(tipo);
    this.setPeso(peso);
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  void setTipo(String tipo) {
    if (tipo.equals("Cachorro") || tipo.equals("Gato")) {
      this.tipo = tipo;
    }
  }
  void setPeso(double peso) {
    this.peso = peso;
  }

  String getNome() {
    return this.nome;
  }

  String getTipo() {
    return this.tipo;
  }

  double getPeso() {
    return this.peso;
  }
}