package bytebank_heranca;

public class Gerente extends Funcionario  implements Autenticavel{

	private ValidaSenha senhaValidada;
	
	public Gerente() {
		this.senhaValidada = new ValidaSenha();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senhaValidada.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.senhaValidada.autentica(senha);
	}
	
	@Override	
	public double getBonificacao() {
		return super.getSalario();
	}


}
