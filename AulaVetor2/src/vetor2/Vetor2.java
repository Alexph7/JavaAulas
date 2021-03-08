package vetor2;

/**
 * @author ALEX
 */
public class Vetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[]= {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i =0;i<mes.length;i++){
            System.out.println("Aqui é o mes: "+mes[i]+" de "+dias[i]);
        }
    }
    
}
