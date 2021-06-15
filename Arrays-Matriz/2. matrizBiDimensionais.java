Declarando Arrays(vetores) 2 Dimensões em Java
//Geralmente usados em tabelas
1.    int[][] idade = new int[3][4];

//ou:
//Declarando um array bidimensional 2 por 4 (2x4 = 8 elementos)
2.    int[][] idade = { { 0, 0, 0, 0 },{ 0, 0, 0, 0 },{ 0, 0, 0, 0 }};

//Você também pode ter colunas diferentes em linhas diferentes. Por exemplo:
3.    int[][] idade = new int[5][]; 
idade[0] = new int[10]; 
idade[1] = new int[6]; 
idade[2] = new int[9]

//Lendo o Array
for(int i=0; i<idade.lenght; i++){
   for(int j = 0; j<idade[i].lenght /* j<idade[i].lenght-1  ?*/  j++){
      System.out.print(idade[i][j]+"");
    }
    System.out.println();
}
===================================================================================================================================================================================
