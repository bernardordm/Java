// Jornal.java
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jornal extends MaterialDeLeitura {

    public Jornal(String nome, String editora, Date dataDePublicacao, String categoria, String edicao) {
        super(nome, editora, dataDePublicacao, categoria);
        setEdicao(edicao);
    }

    @Override
    public void exibirDetalhes() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(getDataDePublicacao());
        System.out.printf("O Jornal %s de edição %s da editora %s foi publicado em %s e é da categoria %s%n", getNome(), getEdicao(), getEditora(), formattedDate, getCategoria());
    }
}