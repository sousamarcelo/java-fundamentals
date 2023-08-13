/*
2.Faça um programa que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/



import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double IPI;
		int codigoPeca1;
		double valorPeca1;
		int quantidadePeca1;
		
		int codigoPeca2;
		double valorPeca2;
		int quantidadePeca2;
		int numeroIteracoes = 2;
		
		double valorTotal;
		
		StringBuilder mensagem = new StringBuilder();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do IPI: ");
		IPI = entrada.nextDouble();
				
		System.out.print("Digite o código da peça 1: ");
		codigoPeca1 = entrada.nextInt();
		System.out.print("Digite o valor da peça 1: ");
		valorPeca1 = entrada.nextDouble();
		System.out.print("Digite a quantidade da peça 1: ");
		quantidadePeca1 = entrada.nextInt();
		
		System.out.print("Digite o código da peça 2: ");
		codigoPeca2 = entrada.nextInt();
		System.out.print("Digite o valor da peça 2: ");
		valorPeca2 = entrada.nextDouble();
		System.out.print("Digite a quantidade da peça 2: ");
		quantidadePeca2 = entrada.nextInt();
		
		valorTotal = (valorPeca1*quantidadePeca1 + valorPeca2*quantidadePeca2)*(IPI/100+1);
		
		System.out.println("Valor total é: " + valorTotal);		
		
		entrada.close();
		

	}

}
