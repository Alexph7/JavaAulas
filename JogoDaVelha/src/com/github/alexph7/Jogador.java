package com.github.alexph7;

class Jogador {
  private final String nomeJog1;
  private final String nomeJog2;
  
  public Jogador(String nomeJog1, String nomeJog2) {
    this.nomeJog1 = nomeJog1;
    this.nomeJog2 = nomeJog2;
  }
     
  public void velha(){
    int[][] velha = new int[3][3];
    int c = 1;
    for (int i = 0 ; i < velha.length; i++) {
      for (int j = 0; j < velha[i].length; j++) {
        velha[i][j] = c++;
        System.out.print("       "+velha[i][j]);
      }
      System.out.println("");
    }
    
  }
  
  public void Jogar(int num){
   // for(int i=0; i < ; i++);
    //if (num = velha) {
      
   // } else {
    //}
  }
  
}
