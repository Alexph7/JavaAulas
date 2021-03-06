package aulapolimorfismo1;

public class Reptil extends Animal{

  @Override
  public void locomover() {
    System.out.println("Rastejando");
  }

  @Override
  public void alimentar() {
    System.out.println("Mamando");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de Mamifero");
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
  
  
}
