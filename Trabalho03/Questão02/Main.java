class Main {
  public static void main (String args[]) {
    Sistema s = new Sistema();

    s.criarContaXPTOBasic();
    s.criarContaXPTOPlus();
    s.criarContaXPTOExtreme();

    for (int i = 0; i<3; i++) s.creditar(i, 1000);

    for (int i = 0; i<3; i++) s.debitar(i, 10);

    System.out.print("s.consultarSaldo(0) == 990 ? ");
    System.out.print(s.consultarSaldo(0) == 990);
    System.out.print("\n");

    System.out.print("s.consultarSaldo(1) == 995 ? ");
    System.out.print(s.consultarSaldo(1) == 995);
    System.out.print("\n");

    System.out.print("s.consultarSaldo(2) == 992.02 ? ");
    System.out.print(s.consultarSaldo(2) == 992.02);
    System.out.print("\n\n");
  }
}

