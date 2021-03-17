package bytebank_heranca;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario juliana = new Gerente();
		juliana.setNome("Juliana Lima");
		juliana.setCpf("111.222.333-44");
		juliana.setSalario(3500);
		
		
		System.out.println(juliana.getNome());
		System.out.println(juliana.getBonificacao());
		  	
	}

}
