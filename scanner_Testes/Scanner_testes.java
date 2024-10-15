package scanner_Testes;
import java.util.Scanner;

public class Scanner_testes {
    
    public static void main(String[] args) {
        int x;
        String n1, n2, n3;
        System.out.println("Digite um número e 3 palavras");
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.nextLine(); // Consome a nova linha restante após o nextInt
        
        n1 = sc.nextLine();
        n2 = sc.nextLine();
        n3 = sc.nextLine();
        
        System.out.println("Termos inseridos:");
        System.out.println(x);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        
        sc.close();
    }
}
