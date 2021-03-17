package bytebank_heranca;

public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f1) {
		double bonificacao = f1.getBonificacao();
		this.soma = this.soma + bonificacao;
	};
	
	public double getSoma() {
		return soma;
	};
	
}
