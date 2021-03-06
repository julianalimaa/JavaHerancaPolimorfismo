package bytebank_heranca;

public class Cliente implements Autenticavel {

	private ValidaSenha senhaValidada;
	
	public Cliente() {
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

}
