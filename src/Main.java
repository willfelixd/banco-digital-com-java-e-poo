
public class Main {

	public static void main(String[] args) {
	
		Cliente william = new Cliente();
		william.setNome("William Felix");
		
		Conta cc = new ContaCorrente(william);
		Conta poupanca = new ContaPoupanca(william);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
