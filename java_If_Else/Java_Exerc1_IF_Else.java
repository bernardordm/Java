package curso_programacao;

import java.util.Scanner;
public class Java_Exerc1_IF_Else {
	public static void main (String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora Telecom");
		System.out.println("Digite o numero de minutos utilizados nesse mês");
		int minutos = sc.nextInt();
		float valor_fixo = 50;
		float valor_final;
		float multa;
		
		if(minutos<=100) {
			System.out.println("O valor a ser pago é de R$ 50.00");
		}
		
		else {
			valor_final = (minutos - 100) * 2 + 50;
			multa = valor_final - valor_fixo;
			
			System.out.printf("O valor a ser pago é de R$ %.2f com R$ %.2f  de multa aplicada", valor_final, multa);
		}
		sc.close();
	}

}
