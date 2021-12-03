package banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente gilberto = new Cliente();
		gilberto.setNome("Gilberto");
		
	Conta cc = new ContaCorrente(gilberto);
	cc.depositar(500);
	
	Conta cp = new ContaPoupanca(gilberto);
	cp.depositar(250);
	cc.transferir(250, cp);
	cp.sacar(50);
	
	cc.imprimirExtrato();
	cp.imprimirExtrato();

	}

}
