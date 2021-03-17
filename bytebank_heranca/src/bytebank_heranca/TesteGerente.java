package bytebank_heranca;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Gabriel");
		gerente.setCpf("222.333.444-55");
		gerente.setSalario(5000);
		gerente.setSenha(1222);
				
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		boolean autenticou = gerente.autentica(1222);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());

	}

}
