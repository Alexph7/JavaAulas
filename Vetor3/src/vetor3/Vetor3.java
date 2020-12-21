package vetor3;

import java.util.Arrays;

/**
 * @author ALEX
 */
public class Vetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vet[] = {3.7,9.1,9.6,4.5};
        Arrays.sort(vet);
        for (double v:vet){
            System.out.print(" ["+v+"] ");
        }
        
    }
    
}
