public class Adocao {
  private Pet pet;
  private Usuario usuario;
  private boolean voltou;
  private Endereco endereco;

  Adocao(Usuario usuario, Pet pet) {
    this.setUsuario(usuario);
    this.setPet(pet);
  }

  Adocao(Usuario usuario, Pet pet, Endereco endereco) {
    this.setUsuario(usuario);
    this.setPet(pet);
    this.setEndereco(endereco);
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

  void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  Endereco getEndereco() {
    return this.endereco;
  }
}