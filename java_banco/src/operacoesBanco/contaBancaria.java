package operacoesBanco;
import java.util.Scanner;
import java.util.Random;
public class contaBancaria {

    private String cpf;
    private int numero;
    private double limite;
    private double saldo;
    private Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    private double valorDoSaque;
    private double valorDoDeposito;
    static int opcaoMenu;

    public void getSaldo(){
        System.out.println("Seu saldo é de :"+ this.saldo);
    }

    public void saque(){
        System.out.println("Digite um valor para sacar :");
        System.out.println("O valor em conta é de R$" + this.saldo);
        System.out.println("O seu limite de crédito é de R$" + this.limite);
        this.valorDoSaque = sc.nextDouble();
        System.out.println("O valor digitado para o saque é de"+ this.valorDoSaque);
        if(this.valorDoSaque > this.saldo + this.limite){
            System.out.println("O valor do saque é maior do que o permitido");
        }
        else{
            this.saldo -= this.valorDoSaque;
            System.out.println("Sucesso !");
            System.out.println("Valor final após o saque é de: R$"+ this.saldo);
        }
    }

    public void deposito(){
        System.out.println("Digite um valor para depositar :");
        this.valorDoDeposito = sc.nextDouble();
        System.out.println("O valor inserido para depósito é de R$:"+ this.valorDoDeposito);

        if (this.saldo < 0) {
            // Calcula a taxa de 3% sobre o saldo negativo
            double taxa = Math.abs(this.saldo) * 0.03;
            System.out.println("Saldo negativo detectado. A taxa de 3% será descontada: R$" + taxa);
            this.valorDoDeposito -= taxa;
        }

        saldo += valorDoDeposito;
        System.out.println("O valor final após o depósito é de R$"+ this.saldo);
    }

    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();

        System.out.println("SISTEMA BANCARIO");
        System.out.println("Insira seu CPF para entrar no sistema:");
        conta.cpf = conta.sc.next();
        System.out.println("CPF digitado : " + conta.cpf);

        conta.numero = random.nextInt(90000)+10000;

        System.out.println("Seu código de cliente : " + conta.numero );

        System.out.println("Insira seu saldo atual:");
        conta.saldo = conta.sc.nextDouble();
        System.out.println("Saldo digitado:"+ conta.saldo);

        conta.limite = conta.saldo/2;

        do {
            System.out.println("MENU");
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Consultar o saldo");
            System.out.println("2 - Realizar um saque");
            System.out.println("3 - Realizar um deposito");
            System.out.println("0 - Finalizar a operação");

            opcaoMenu = conta.sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    conta.getSaldo();
                    break;
                case 2:
                    conta.saque();
                    break;
                case 3:
                    conta.deposito();
                    break;
                case 0:
                    System.out.println("Finalizando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcaoMenu != 0);

        System.out.println("Sistema encerrado.");
    }
}
