package vetor4;

import java.util.Arrays;

/**
 * @author ALEX
 */
public class Vetor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = {3,8,0,6,7,5,7};
        for (int valor:vet){
        System.out.print(valor+" ");
        }
        int p = Arrays.binarySearch(vet, 7);
        System.out.println("valor posição "+p);
        
    }
    
}
