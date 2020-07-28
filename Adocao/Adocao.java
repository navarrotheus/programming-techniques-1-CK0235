public class Adocao {
  private Pet pet;
  private Usuario usuario;
  private boolean voltou;

  Adocao(Usuario usuario, Pet pet) {
    this.setUsuario(usuario);
    this.setPet(pet);
  }

  void setPet(Pet pet) {
    this.pet = pet;
  }

  Pet getPet() {
    return this.pet;
  }

  void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  Usuario getUsuario() {
    return this.usuario;
  }

  void setVoltou(boolean voltou) {
    this.voltou = voltou;
  }

  boolean getVoltou() {
    return this.voltou;
  }
}