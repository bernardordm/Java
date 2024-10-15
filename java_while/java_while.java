package java_while;

import java.util.Scanner;

public class java_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt() ;
		int soma =  numero;
		
		
		while(numero != 0) {
			System.out.println("Digite um ou mais numeros para serem somados, para finalizar a operacao digite 0.");
			numero = sc.nextInt() ;
			soma += numero;
			System.out.println(soma);
			
			
		}
		System.out.println(soma);
		sc.close();

	}

}
