package atv5;

public class Conta {

	private int numero;
    private double saldo;
    private double extrato;
    private String nome;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getExtrato() {
        return extrato;
    }

    public void setExtrato(double extrato) {
    	this.extrato = extrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposita(double valor){
        saldo = saldo + valor;
    }
    
    public void saca(double valor){
        saldo = saldo - valor;
    }

    public void transfere(Conta destino ,double valor){
         this.saldo = this.saldo - valor;
         destino.saldo = destino.saldo + valor;
    }
    
    @Override
    public String toString() {
        return "Conta: " + numero + 
        		" tem R$ " + saldo + " de saldo " + 
        		"e o usuário é = " + nome;
    }
    
}
