package imabank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); //criar uma instancia = copia
//		pessoaNumero1.nome = "José das Couves";
//		pessoaNumero1.profissão = "Agricultor";
//		pessoaNumero1.cpf = "750.562.835-68";
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissão: " + pessoaNumero1.profissão);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "João dos Tomates";
//		System.out.println("=======================");
//		
//		System.out.println("Nome: " + pessoaNumero2.nome);
//		System.out.println("Profissão: " + pessoaNumero2.profissão);
//		System.out.println("CPF: " + pessoaNumero2.cpf);
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setSaldo(1000000.50); >>não se deve alterar diretamente essa informação, ela apenas pode ser exibida
		conta1.setTitular("Isabela Argolo");
		
		conta1.depositar(100.0);
		
		System.out.println("Agencia: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Saldo Atual: " + conta1.getSaldo());
		System.out.println("Titular: " + conta1.getTitular());
		
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		}
		else {
			System.out.println("Saldo insuficiente. Verifique o valor do saque!");
		}

		System.out.println("Saldo Atual: " + conta1.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(10000.0, conta2);
		
		System.out.println("Saldo Atual conta1: " + conta1.getSaldo());
		System.out.println("Saldo Atual conta2: " + conta2.getSaldo());
		
		
	}
}
