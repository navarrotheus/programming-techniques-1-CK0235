class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    Pet p1, p2, p3;

    p1 = new Pet("Rick", "Cachorro");
    p2 = new Pet("Oreo", "Gato");
    p3 = new Pet("Rex", "Cachorro", 2.3);

    System.out.println("Pet: " + p1.getNome() + " - " + p1.getTipo() + " - " + p1.getPeso() + "kg");
    System.out.println("Pet: " + p2.getNome() + " - " + p2.getTipo() + " - " + p2.getPeso() + "kg");
    System.out.println("Pet: " + p3.getNome() + " - " + p3.getTipo() + " - " + p3.getPeso() + "kg");

    Usuario u1, u2, u3;

    u1 = new Usuario("Matheus", new Endereco("Humberto Monte", "1132", "Benfica"));
    u2 = new Usuario("Arthus", new Endereco("Avenida Bezerra de Menezes", "6623", "Barra do Ceará"));
    u3 = new Usuario("Arthur", new Endereco("Avenida Washington Soares", "5832", "Zé Walter"));

    System.out.println("Usuario: " + u1.getNome() + " Mora em: " + u1.getEndereco().getInfo());
    System.out.println("Usuario: " + u2.getNome() + " Mora em: " + u2.getEndereco().getInfo());
    System.out.println("Usuario: " + u3.getNome() + " Mora em: " + u3.getEndereco().getInfo());

    Adocao a1, a2, a3;

    a1 = new Adocao(u1, p1, new Endereco("Avenida Mister Hull", "s/n", "Pici"));
    a2 = new Adocao(u2, p2);
    a3 = new Adocao(u3, p3);

    System.out.println("Adocao: " + a1.getUsuario().getNome() + " adotou " + a1.getPet().getNome() + " em " + a1.getEndereco().getInfo());
    System.out.println("Adocao: " + a2.getUsuario().getNome() + " adotou " + a2.getPet().getNome());
    System.out.println("Adocao: " + a3.getUsuario().getNome() + " adotou " + a3.getPet().getNome());

    a2.setVoltou(true);

    System.out.println(a2.getUsuario().getNome() + " retornou o " + a2.getPet().getNome() + " ? " + a2.getVoltou());
    System.out.println(a3.getUsuario().getNome() + " retornou o " + a3.getPet().getNome() + " ? " + a3.getVoltou());
  }
}
