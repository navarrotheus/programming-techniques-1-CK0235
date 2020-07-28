public class Usuario {
  private String nome;

  Usuario(String nome) {
    this.setNome(nome);
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return this.nome;
  }
}