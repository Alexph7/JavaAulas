package testeherança;
public class TesteHerança {

    public static void main(String[] args) {
//      Visitante v1 = new Visitante();
//      v1.setNome("Alex");
//      v1.setIdade(28);
//     v1.setSexo("M");
//      System.out.println(v1.toString());

    Aluno al = new Aluno();
    al.setCurso("Java");
    al.setIdade(24);
    al.setMatricula(14005);
    al.setNome("Alisson");
    al.setSexo("M");
    al.pagarMensalidade();
      System.out.println(al.toString());
    Bolsista b1 = new Bolsista();
    b1.setMatricula(12);
    b1.setNome("Joao");
    b1.setBolsa(12.5f);
    b1.setSexo("M");
    b1.pagarMensalidade();
      
    }

}
