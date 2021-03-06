package arrays1;

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
      
      Scanner tec = new Scanner(System.in);
      
      double dia001 = 31.3;
      double dia002 = 30.2;
      double dia003 = 29.4;
      double dia004 = 29.3;
    
      double[] temp = new double[365];
      
      for(int i=0;i<temp.length;i++){
        System.out.println( "Temperatura do dia: "+(i+1));
        String dia = tec.next();
      }
    }
}
