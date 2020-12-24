
package numerosaleatorios;

public class NumerosAleatorios {

    public static void main(String[] args) {
        
        int[] numAle = new int[50];
        
        for (int i=0;i<numAle.length;i++){
            double ale = Math.floor(Math.random()*100);
            numAle[i]=(int) ale;
            System.out.println(numAle[i]);
        }
        
    }
    
}
