Declarando Arrays(vetores) 2 Dimensões em Java
//Geralmente usados em tabelas
int[][] idade = new int[3][4];

//ou:
//Declarando um array bidimensional 2 por 4 (2x4 = 8 elementos)
int[][] idade = { { 0, 0, 0, 0 },{ 0, 0, 0, 0 },{ 0, 0, 0, 0 }};

//Lendo o Array
for(int i=0; i<idade.lenght; i++){
   for(int j = 0; j<idade[i].lenght /* j<idade[i].lenght-1  ?*/  j++){
      System.out.print(idade[i][j]+"");
    }
    System.out.println();
}
===================================================================================================================================================================================
