
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia , int numero) {
		if(agencia <= 0 || numero <= 0) {
			System.out.println("Valor não pode ser negativo ou igual zero");
			return;
		} else {
			this.agencia = agencia;
			this.numero = numero;		
			//System.out.println("Estou criando a conta nº " + this.numero + ", agência nº " 
			//+ agencia);
			Conta.total++;
			//System.out.println("O total de contas é " + Conta.total);
		}
		
	}
	
	
	public void deposita(double valor){
		this.saldo += valor;
		//this.saldo = this.saldo + valor;
	}
	
	
	public boolean saca(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
	public double getSaldo(){
		return this.saldo;
	}
	
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode ser um valor negativo ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	
	
	public int getNumero() {
		return this.numero;		
	}
	public void setNumero (int numero){
		this.numero = numero;
	}
	
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}