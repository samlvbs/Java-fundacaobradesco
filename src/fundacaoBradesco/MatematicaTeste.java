package fundacaoBradesco;
import java.util.Scanner;
public class MatematicaTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first, second;
		System.out.println("Insira o primeiro número inteiro: ");
		first = input.nextInt();
		System.out.println("Insira o segundo número inteiro: ");
		second = input.nextInt();
		Matematica m = new Matematica();
		int maior = m.maior(first,second);
		System.out.println("Maior número: "+ maior);
		
		double soma = m.soma(first, second);
		System.out.println("E a soma dos números é: "+soma);
	}
}
