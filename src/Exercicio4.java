/*
 4. Escreva um programa que verifique a validade de uma senha fornecida pelo
usuário. A senha válida é o número1234. Devem ser impressas as seguintes
mensagens:
ACESSOPERMITIDO caso a senha seja válida.
ACESSONEGADO caso a senha seja inválida.
 */

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int password = 1234;
		int userPassword;
		
		StringBuilder messages = new StringBuilder();
		
		userPassword = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
		
		if (userPassword == password) {
			messages.append("Senha correta, acesso liberado");
			JOptionPane.showMessageDialog(null, messages);
		} else {
			messages.append("Senha incorreta!");
			JOptionPane.showMessageDialog(null, messages);
		}

	}

}
