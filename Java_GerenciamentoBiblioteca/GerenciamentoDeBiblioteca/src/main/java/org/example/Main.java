package org.example;

import model.Jornal;
import model.Livro;
import model.Revista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Jornal> jornais = new ArrayList<>();
    private static List<Livro> livros = new ArrayList<>();
    private static List<Revista> revistas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Jornal");
            System.out.println("2. Adicionar Livro");
            System.out.println("3. Adicionar Revista");
            System.out.println("4. Listar Jornais");
            System.out.println("5. Listar Livros");
            System.out.println("6. Listar Revistas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    adicionarJornal(scanner);
                    break;
                case 2:
                    adicionarLivro(scanner);
                    break;
                case 3:
                    adicionarRevista(scanner);
                    break;
                case 4:
                    listarJornais();
                    break;
                case 5:
                    listarLivros();
                    break;
                case 6:
                    listarRevistas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);
    }

    private static Date parseDate(String dateStr) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void adicionarJornal(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        System.out.print("Data de Publicação (dd/MM/yyyy): ");
        Date dataDePublicacao = parseDate(scanner.nextLine());
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Edição: ");
        String edicao = scanner.nextLine();

        Jornal jornal = new Jornal(nome, editora, dataDePublicacao, categoria, edicao);
        jornais.add(jornal);
        System.out.println("Jornal adicionado com sucesso!");
    }

    private static void adicionarLivro(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        System.out.print("Data de Publicação (dd/MM/yyyy): ");
        Date dataDePublicacao = parseDate(scanner.nextLine());
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        Livro livro = new Livro(nome, editora, dataDePublicacao, categoria);
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void adicionarRevista(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        System.out.print("Data de Publicação (dd/MM/yyyy): ");
        Date dataDePublicacao = parseDate(scanner.nextLine());
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        Revista revista = new Revista(nome, editora, dataDePublicacao, categoria);
        revistas.add(revista);
        System.out.println("Revista adicionada com sucesso!");
    }

    private static void listarJornais() {
        for (Jornal jornal : jornais) {
            jornal.exibirDetalhes();
        }
    }

    private static void listarLivros() {
        for (Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }

    private static void listarRevistas() {
        for (Revista revista : revistas) {
            revista.exibirDetalhes();
        }
    }
}