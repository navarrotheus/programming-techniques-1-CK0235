public class Usuario {
  private String nome;
  private Endereco endereco;

  Usuario(String nome) {
    this.setNome(nome);
  }

  Usuario(String nome, Endereco endereco) {
    this.setNome(nome);
    this.setEndereco(endereco);
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return this.nome;
  }

  void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  Endereco getEndereco() {
    return this.endereco;
  }
}