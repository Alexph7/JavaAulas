package agendamain;

import java.util.Scanner;

public class AgendaMain {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Agenda ag = new Agenda();
      System.out.println("Entre Com Nome Da Agenda: ");
      String nomeAg = scan.nextLine();
      
      Contato[] contatos = new Contato[3];
      for(int i=0;i<3;i++){
        System.out.println("Entre com as informações do contato: ");
        Contato c = new Contato();
        
        System.out.println("Digite o Nome Do Contato: ");
        String nomeCon = scan.nextLine();
        c.setNome(nomeCon);
        
        System.out.println("Digite o Telefone Do Contato: ");
        String telCon = scan.nextLine();
        c.setNome(telCon);
        
        System.out.println("Digite o Email Do Contato: ");
        String emailCon = scan.nextLine();
        c.setEmail(emailCon);
        
        contatos[i] = c;
      }
      ag.setContato(contatos);
      
      System.out.println();
   }
}
