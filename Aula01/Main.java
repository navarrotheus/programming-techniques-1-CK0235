class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    // Declaracao de pessoa
    Pessoa p1, p2, p3;

    // Instanciacao de um objeto
    p1 = new Pessoa("Ana", 18);
    p2 = new Pessoa("Joao");
    p3 = new Pessoa("Maria", 53);

    Casamento c1 = new Casamento(p1, p3);

    System.out.println("Pessoa: " + p1.getNome() + " - " + p1.getIdade());

    p2.setIdade(14);
    System.out.println("Pessoa: " + p2.getNome() + " - " + p2.getIdade());

    System.out.println("Pessoa: " + p3.getNome() + " - " + p3.getIdade());
  }
}
