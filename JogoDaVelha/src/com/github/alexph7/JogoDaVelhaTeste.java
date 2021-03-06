package com.github.alexph7;

import java.util.Scanner;

public class JogoDaVelhaTeste {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Jogador 1 Digite Seu Nome");
    String nome = scan.nextLine();
    System.out.println("Jogador 2 Digite Seu Nome");
    String nome2 = scan.nextLine();
    
    Jogador k = new Jogador(nome, nome2);
    k.velha();
    System.out.println(nome+"Digite Um Número de 1 a 9 Para Marcar \"x\"");
    int j1 = scan.nextInt();
    k.Jogar(j1);
    
}
}
