package contabanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in); 
        System.out.println("Escolha o Tipo da Conta: cc = Conta Corrente, cp = Conta Poupança ");
        String aa = tec.nextLine();
        System.out.println("Digite Seu Nome: ");
        String d = tec.nextLine();
        System.out.println("Escolha Um Numero Pra Criar Conta: ");
        int a = tec.nextInt();
        ContaBancoh Cb = new ContaBancoh(a,aa,d);
        Cb.abrirConta();
        Cb.sacar(43f);
        Cb.status();
    }

}
