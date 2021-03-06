package pessoaaulaheranca;
public class PessoaTeste {
  
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();
    
    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Cláudio");
    p4.setNome("Fabiana");
    
    p2.setCurso("java");
    p3.setSalario(2.500f);
    p4.setSetor("Sala");
    
    p1.fazerAniversario();
    System.out.println(p1.toString());
    
    }

}
