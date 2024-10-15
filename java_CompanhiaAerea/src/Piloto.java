import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Piloto {
    String nome;
    String numeroRegistro;
    Date validadeRegistro;
    String strvalidadeRegistro;
    Scanner sc = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    void addPiloto(String nome, String numeroRegistro, Date validadeRegistro){
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.validadeRegistro = validadeRegistro;

    }
    void atualizarDataDeValidade(Date validadeRegistro, String strvalidadeRegistro){
        this.validadeRegistro = validadeRegistro;
        System.out.println("Data atual do registro cadastrada no sistema:");
        System.out.println("Digite a nova validade do registro no formato dd/MM/AAAA");
        strvalidadeRegistro = sc.next();

        Date validadeRegistro = sdf.parse(strvalidadeRegistro);



    }
}

