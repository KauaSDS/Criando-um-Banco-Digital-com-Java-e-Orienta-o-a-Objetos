
public class Main {

	public static void main(String[] args) {
		Cliente kaua = new Cliente();
		kaua.setNome("Venilton");
		
		Conta cc = new ContaCorrente(kaua);
		Conta poupanca = new ContaPoupanca(kaua);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}