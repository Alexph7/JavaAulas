package jogodavelhateste;

import java.util.Scanner;

public class JogoDaVelhaTeste {

public static void chamarVelha(Object[][] velha){
  
  int c = 1;
  for (int i = 0; i < velha.length; i++) {
    for (int j = 0; j < velha[i].length; j++) {
      velha[i][j] = c++;
      if (j == 0) {
        System.out.print("           " + velha[i][j]);
      } else {
        System.out.print(" | " + velha[i][j]);
      }
    }
    System.out.println("");
    if (i != 2) {
      System.out.println("          ---+---+---");
    
    }
  }
}
public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  System.out.println("Jogador 1 Digite Seu Nome: ");
  String j1 = scan.nextLine();
  System.out.println("Jogador 2 Digite Seu Nome: ");
  String j2 = scan.nextLine();

  Object[][] velha = new Object[3][3];
  
  int cc = 0;
  String x;

  boolean ganhador = false;

  while ((ganhador == false) && (cc < 9)) {
    if (cc % 2 == 0) {
      x = "x";
      System.out.println(j1 + " Digite Um Numero Par Marcar \"x\": ");
    } else {
      x = "o";
      System.out.println(j2 + " Digite Um Numero Par Marcar \"o\": ");
    }
    int jogada = scan.nextInt();
    Integer resp = jogada;

    for (int i = 0; i < velha.length; i++) {
      for (int j = 0; j < 8; j++) {
        if (resp.equals(velha[i][j])) {
          if (!velha[i][j].equals(x)) {
            velha[i][j] = x;
          }
        } else {
          System.out.println("Digite um Numero Entre 1 - 9");
        }
      }
    }

    for (int i = 0; i < velha.length; i++) {
      if ((velha[i][0] == velha[i][1]) && (velha[i][1] == velha[i][2])) {
        ganhador = true;
        //System.out.println("Parabéns " +  + " Você Ganhou!!");
      }
    }
    for (int i = 0; i < velha.length; i++) {
      if ((velha[0][i] == velha[1][i]) && (velha[1][i] == velha[2][i])) {
        ganhador = true;
        // System.out.println("Parabéns " + x + " Você Ganhou!!");
      }
    }

    if ((velha[0][0] == velha[1][1]) && (velha[1][1] == velha[2][2])) {
      ganhador = true;
//    System.out.println("Parabéns " + x + " Você Ganhou!!");
    } else if ((velha[0][2] == velha[1][1]) && (velha[2][0] == velha[3][3])) {
      ganhador = true;
      //   System.out.println("Parabéns " + x + " Você Ganhou!!");
    }
    cc++;
    if (cc == 9) {
      System.out.println("Deu Velha!!!");
    }
  }

}

}