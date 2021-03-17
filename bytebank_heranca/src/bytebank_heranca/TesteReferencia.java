package bytebank_heranca;

public class TesteReferencia {

	public static void main(String[] args) {


		Gerente g1 = new Gerente();
		g1.setNome("Gabriel");
		g1.setSalario(5000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		Designer dg = new Designer();
		dg.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(dg);
				
		System.out.println(controle.getSoma());
		

	}

}
