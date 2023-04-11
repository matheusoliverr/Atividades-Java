public class Conta {
    private int nConta;
    private String nomeTitular;
    private float valorConta;

    public int getNumero(){
        return nConta;
    }

    public void setNumero(int nConta){
        this.nConta = nConta;
    }

    public String getNome(){
        return nomeTitular;
    }

    public void setNome(String nome){
        this.nomeTitular = nome;
    }

    public void deposito(float dep){
        this.valorConta = this.valorConta + dep;
        getConta();
    }

    public void retirada(float ret){
        this.valorConta = this.valorConta - ret - 5;
        getConta();
    }

    public float getValor(){
        return valorConta;
    }

    public void getConta(){
        System.out.println("Dados da conta:");
        System.out.printf("Conta %d, Titular: %s, Saldo: R$ %.2f\n\n", getNumero(), getNome(), getValor());
    }

}
