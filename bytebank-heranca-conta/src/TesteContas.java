
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 2222);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 3333);
		cp.deposita(200);
		
		cc.saca(10);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
