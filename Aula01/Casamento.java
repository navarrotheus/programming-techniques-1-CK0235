public class Casamento {
  Pessoa p1, p2;
  String Data;
  int numeroDocumento;

  Casamento (Pessoa p1, Pessoa p2) {
    if (p1!=p2) {
      this.p1 = p1;
      this.p2 = p2;

      p1.setCasamento(this);
      p2.setCasamento(this);
    }
  }
}