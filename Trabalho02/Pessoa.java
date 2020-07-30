class Pessoa {
  private String nome;
  private int idade;

  Pessoa(String nome, int idade) {
    this.setIdade(idade);
    this.setNome(nome);
  }
  Pessoa() {
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return this.nome;
  }

  void setIdade(int idade) {
    this.idade = idade;
  }

  int getIdade() {
    return this.idade;
  }

  String getInfo() {
    return "NOME: " + this.nome + ", IDADE: " + this.idade; 
  }
}