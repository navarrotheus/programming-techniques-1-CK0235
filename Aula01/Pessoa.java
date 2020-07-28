public class Pessoa {
  private String nome;
  private int idade;

  private Casamento casamento;

  Pessoa(String nome, int idade) {
    this.setNome(nome);
    this.setIdade(idade);
  }

  Pessoa(String nome) {
    this.setNome(nome);
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  void setIdade(int idade) {
    if (idade > 0 && idade < 120) {
      this.idade = idade;
    }
  }

  void setCasamento(Casamento casamento) {
    this.casamento = casamento;
  }

  String getNome() {
    return this.nome;
  }

  int getIdade () {
    return this.idade;
  }
}