package prgcurso;

import java.util.Scanner;

public class PrgCurso {

    public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Digite o Nome Do Curso: ");
      String nome = scan.nextLine();
      
      System.out.println("Digite o Horario do Curso: ");
      String hora = scan.nextLine();
      
      System.out.println("Digite o Nome do Professor: ");
      String nomeProf = scan.nextLine();
      
      System.out.println("Digite o email do Professor: ");
      String emailP = scan.nextLine();
      
      Curso curso = new Curso();
      curso.setNome(nome);
      curso.setHorario(hora);
      
      Professor professor = new Professor();
      professor.setNome(nomeProf);
      professor.setEmail(emailP);
      
      curso.setProfessor(professor);
      
      
    }

}