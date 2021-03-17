package bytebank_heranca;

public class Administrador extends Funcionario implements Autenticavel{

private ValidaSenha senhaValidada;
	
	public Administrador() {
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
		return 0;
	}
};
