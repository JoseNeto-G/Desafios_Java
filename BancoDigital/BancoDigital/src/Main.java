public class Main {

	public static void main(String[] args) {
		Cliente n = new Cliente();
		n.setNome("Robson");
		
		Conta cc = new ContaCorrente(n);
		Conta poupanca = new ContaPoupanca(n);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
