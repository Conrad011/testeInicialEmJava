package PooAula05;

public class conta {
    int numConta;
    protected String tipo;
    private String dono;
    private double saldo = 1300;
    boolean  status;
    double saque;
    double newSaldo;
    double NewSaldo;
    
   public void info(){

       System.out.println("O conta de numero: " + numConta);
       System.out.println("Do tipo: "+tipo);
       System.out.println("SEU NOME: "+dono);
       System.out.println("Sua conta esta abertas ? " + this.status);
       if (status == false){
           System.out.println(fecharConta());
       }
       if (status == true){
           System.out.println(abrirConta());
       }

       System.out.println(depositarDinheiro());
       System.out.println(sacarDinheiro());
       System.out.println(pagamentoMensal());
   }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = Boolean.parseBoolean(status);
    }

    public boolean abrirConta(){
        System.out.println("Conta aberta e ativa");
        return true;
    }
    public boolean fecharConta(){
        System.out.println("Conta fechada. Encerrando o programa");
        return false;
    }

   public String getDono(){
       return this.getDono();
   }
   public void setDono(String dono){
       this.dono = dono;
   }

    public double getSaldo(){
       return saldo;
    }
    public void setSaldo(double saldo){
       this.saldo = saldo;
       saldo -= newSaldo;
    }

    public boolean depositarDinheiro(){
        saldo += newSaldo;
        return true ;
    }
    public double sacarDinheiro(){
        double teste = saldo -= NewSaldo;

       if (saldo < 0){
           System.out.println("Saldo insuficeiente");
       }else {
           System.out.println("Saldo antes do desconto: R$" + teste );
       }
       return teste;
    }
    public boolean pagamentoMensal(){
        double pagMes = saldo - 4.90;
        System.out.println("Sera debitado a cada operacao um valor de R$4.90");
        System.out.println("Sendo assim o seu NOVO SALDO: R$"+pagMes);
        return true;
    }


}
