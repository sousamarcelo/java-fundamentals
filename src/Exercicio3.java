/*
Faça um programa par ler 2 valores (considere que não serão informados
valores iguais) e escrever o maior deles.
 */

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int valor1;
		int valor2;
		
		StringBuilder mensagem = new StringBuilder();
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
		
		if (valor1 > valor2) {
			mensagem
				.append("O primeiro valor informado é maior: ")
				.append(valor1);
			JOptionPane.showMessageDialog(null, mensagem);
		} else {
			mensagem
				.append("O segundo valor informado é maior: ")
				.append(valor2);
			JOptionPane.showMessageDialog(null, mensagem);
		}
		
	}

}
