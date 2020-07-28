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

    u1 = new Usuario("Matheus");
    u2 = new Usuario("Arthus");
    u3 = new Usuario("Arthur");

    System.out.println("Usuario: " + u1.getNome());
    System.out.println("Usuario: " + u2.getNome());
    System.out.println("Usuario: " + u3.getNome());

    Adocao a1, a2, a3;

    a1 = new Adocao(u1, p1);
    a2 = new Adocao(u2, p2);
    a3 = new Adocao(u3, p3);

    System.out.println("Adocao: " + a1.getUsuario().getNome() + " adotou " + a1.getPet().getNome());
    System.out.println("Adocao: " + a2.getUsuario().getNome() + " adotou " + a2.getPet().getNome());
    System.out.println("Adocao: " + a3.getUsuario().getNome() + " adotou " + a3.getPet().getNome());
  }
}
