package curso_programacao;

import java.util.Scanner;

public class Java_IF_Else {
	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite um horário :");
			int hora = sc.nextInt();

			if (hora < 12) {
				System.out.println("Bom dia");
			} 
			
			else {
				if (hora < 18) {
					System.out.println("Boa tarde");
				}

				else if (hora >= 18 && hora < 25) {
					System.out.println("Boa noite");
				} else if (hora > 24) {
					System.out.println("Horário inválido");
				}
			}
		}
	}

}
