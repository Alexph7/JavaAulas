package contabanco;

public class ContaBancoh {
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean fechado;

    public ContaBancoh(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.fechado = false;
    }
    public void status(){
        System.out.println("------------------------------------------");
        System.out.println("Nome Do Cliente "+ this.dono);
        System.out.print("Tipo De Conta: ");
        if(this.getTipo().equals("cc")){
            System.out.println("Corrente.");
        }else if(this.getTipo().equals("cp")){
            System.out.println("Poupança");
        }
        System.out.println("Número Da Conta = "+this.getNumConta());
        System.out.println("Saldo: "+ this.getSaldo());
        if(this.isFechado()){
            System.out.println("A Conta Está Fechada.");
        }else{
            System.out.println("A Conta Está Aberta.");
        }
        
    }
    public void abrirConta(){
        setFechado(false);
        if(getTipo().equals("cc")){
            setSaldo(getSaldo()+50f);
        }else if(getTipo().equals("cp")){
            setSaldo(getSaldo()+150);
        }
        else{
            System.out.println("É nexessário informar o Tipo da Conta.");
        }
    }
    public void fecharConta(){
        if(getSaldo()!=0){
            System.out.println("Há Saldo Na Conta, Impossivel Fechar.");
        }else{
            isFechado();
        }
    }
    public void depositar(float m){
        if(isFechado()){
            System.out.println("Conta Fechada Impossível Depositar.");
        }
        setSaldo(getSaldo()+m);
    }
    public void sacar(float m){
        if(isFechado()){
            System.out.println("Conta Fechada Impossível Sacar.");
        }else if(getSaldo()<m){
            System.out.println("Saldo Insulficiente.");
        }else{
            setSaldo(getSaldo()-m);
            System.out.println("Você Sacou: "+m+"R$");
        }
    }
    public void pagarMensal(float m){
        if(isFechado()){
            System.out.println("Conta Fechada Impossível Fazer Pagamentos.");
        }else if(getSaldo()<m){
            System.out.println("Saldo Insulficiente.");
        }else{
            setSaldo(getSaldo()-m);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
