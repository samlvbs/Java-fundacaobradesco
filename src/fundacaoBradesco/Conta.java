package fundacaoBradesco;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente +" seu saldo é: R$"+ saldo);
	}
	
	void saque(double valor) {
		saldo -=valor;
	}
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	void transferencia(Conta destino, double valor) {
		this.saque(valor);
		destino.depositar(valor);
	}
}
