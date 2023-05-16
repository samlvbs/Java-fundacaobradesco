package fundacaoBradesco;
import java.util.Scanner;
public class ContaTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//cria o objeto conta que instancia a classe Conta;
		Conta conta = new Conta();
			conta.cliente = "Samuel";
			conta.saldo = 1_000.00;
			conta.exibeSaldo();
		//Método para sacar um valor de saldo e exibir.
		System.out.println("Insira o valor que deseja sacar: ");
		double valorSaque = input.nextDouble();
		conta.saque(valorSaque);
		conta.exibeSaldo();
		//Método para depositar um valor e exibir
		System.out.println("Insira o valor que deseja depositar: ");
		double valorDeposito = input.nextDouble();
		conta.depositar(valorDeposito);
		conta.exibeSaldo();
		
		System.out.println("Informe o destino da transferencia: ");
		Conta destino = new Conta();
		destino.cliente = input.next();
		System.out.println("Informe o valor: ");
		destino.saldo = input.nextDouble();
		destino.exibeSaldo();
		conta.saque(destino.saldo);
		conta.exibeSaldo();
	}
}
