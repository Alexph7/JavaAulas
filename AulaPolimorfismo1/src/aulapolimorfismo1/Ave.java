package aulapolimorfismo1;

public class Ave extends Animal{
  private String corPena;
  
  public void fazerNinho(){
    System.out.println("Fez um Ninho.");
  }
  @Override
  public void locomover() {
    System.out.println("Voando");
  }
  public String getCorPena() {
    return corPena;
  }

  public void setCorPena(String corPena) {
    this.corPena = corPena;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getMembros() {
    return membros;
  }

  public void setMembros(int membros) {
    this.membros = membros;
  }

  @Override
  public void alimentar() {
    System.out.println("Comendo Frutas");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de Ave");
  }

}
