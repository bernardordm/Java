// MaterialDeLeitura.java
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class MaterialDeLeitura {
    private String id_material;
    private String nome;
    private String editora;
    private String categoria;
    private Date dataDePublicacao;
    private String edicao;

    public MaterialDeLeitura(String nome, String editora, Date dataDePublicacao, String categoria) {
        this.nome = nome;
        this.editora = editora;
        this.dataDePublicacao = dataDePublicacao;
        this.categoria = categoria;
    }

    public void setID(String ID) {
        this.id_material = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDataDePublicacao(Date dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public String getID() {
        return id_material;
    }

    public String getNome() {
        return nome;
    }

    public String getEditora() {
        return editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public Date getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void exibirDetalhes() {
        // Implementação nas subclasses
    }

    public boolean isDataValida() {
        return dataDePublicacao != null;
    }

    public void atualizarInformacoes(String nome, String editora, Date dataDePublicacao, String categoria, String edicao) {
        setNome(nome);
        setEditora(editora);
        setDataDePublicacao(dataDePublicacao);
        setCategoria(categoria);
        setEdicao(edicao);
    }

    public boolean comparar(MaterialDeLeitura outro) {
        return this.nome.equals(outro.getNome()) && this.editora.equals(outro.getEditora());
    }
}