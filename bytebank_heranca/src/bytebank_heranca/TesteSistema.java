package bytebank_heranca;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(1222);
		
		Administrador adm = new Administrador();
		adm.setSenha(1222);
		
		Cliente c = new Cliente();
		c.setSenha(1222);
		
		
		SistemaInterno sisInt = new SistemaInterno();
		
		sisInt.autentica(g);
		sisInt.autentica(adm);
		sisInt.autentica(c);
			
	}

}
