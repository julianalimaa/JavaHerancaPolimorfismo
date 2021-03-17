
public class TestaCalculador {

 public static void main(String[] args) {
	
	 
	SeguroVida s = new SeguroVida();
	s.getValorImposto();
	 
	ContaCorrente cc = new ContaCorrente(100, 2000);
	cc.getValorImposto();
	cc.deposita(500);
	 
	CalculadorDeImposto calculador = new CalculadorDeImposto();
	
	calculador.registra(cc);
	calculador.registra(s);
	
	 
	System.out.println(s.getValorImposto());
	System.out.println(cc.getValorImposto());
	
	System.out.println(calculador.getTotalImposto());
	
	
	 
}
	
	
}
