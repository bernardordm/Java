// Revista.java
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Revista extends MaterialDeLeitura {

    public Revista(String nome, String editora, Date dataDePublicacao, String categoria) {
        super(nome, editora, dataDePublicacao, categoria);
    }

    @Override
    public void exibirDetalhes() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(getDataDePublicacao());
        System.out.printf("A revista %s de edição %s da editora %s foi publicado em %s e é da categoria %s%n", getNome(), getEdicao(), getEditora(), formattedDate, getCategoria());
    }
}