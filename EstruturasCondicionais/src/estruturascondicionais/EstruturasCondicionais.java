package estruturascondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite 1 nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite 2 nota:");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("A média é "+m);
        
            if(m>0 && m<6){
                System.out.println("Você Foi Reprovado");
            }
                else if (m<5.5 && m<7.5){
                        System.out.println("Você Ficou de Recuperção");
                }                
                    else if(m>=7.5 && m<10){
                                System.out.println("PARABÉNS, VOCÊ FOI APROVADO!");
                    }else{
                        System.out.println("ERRO!!!");
                    }
            }                  
                        
        }
    
