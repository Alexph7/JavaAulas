package pooaula1;

public class PooAula1 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preto";
        c2.destampar();
        c1.status();
        c2.rabiscar();
        
        
    }
    
}
