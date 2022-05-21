
public class Main {

	public static void main(String[] args) {
	
		Cliente william = new Cliente();
		william.setNome("William Felix");
		
		Conta ccwilliam = new ContaCorrente(william);
		Conta poupancawilliam = new ContaPoupanca(william);
		ccwilliam.depositar(100);
		ccwilliam.transferir(50, poupancawilliam);
		poupancawilliam.sacar(25);
		
		Cliente maria = new Cliente();
		maria.setNome("Maria Felix");
		
		Conta ccmaria = new ContaCorrente(maria);
		Conta poupancamaria = new ContaPoupanca(maria);
		ccmaria.depositar(150);
		poupancamaria.depositar(175);
		ccmaria.enviarPix(50, ccwilliam);
		poupancamaria.enviarPix(75, poupancawilliam);
		
		
		ccwilliam.imprimirExtrato();
		poupancawilliam.imprimirExtrato();
		System.out.println();
		ccmaria.imprimirExtrato();
		poupancamaria.imprimirExtrato();
		
		System.out.println();
		System.out.println("** Lista de Clientes com Conta no Banco **");
		ccwilliam.imprimirListaClientes();
		ccmaria.imprimirListaClientes();
	}
}
