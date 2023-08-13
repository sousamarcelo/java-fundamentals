
/*
1.Faça um programa que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e
o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int anos;
		int meses;
		int dias;
		int total;
		
		StringBuffer mensagem = new StringBuffer();
		
		anos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de anos? "));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de meses?"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dias?"));
		total = (anos*365) + (meses*30) + dias;
		
		
		mensagem.append("Total em dias: ").append(total);
		
		JOptionPane.showMessageDialog(null, mensagem);	

	}

}
