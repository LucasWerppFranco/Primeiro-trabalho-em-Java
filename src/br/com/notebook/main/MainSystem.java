package br.com.notebook.main;

import br.com.notebook.model.Notebook;

public class MainSystem {

    public static void main(String[] args) {

        Notebook meuNotebook = new Notebook();

        System.out.println("=== TESTE COM VALORES VÁLIDOS ===");

        meuNotebook.atualizarProcessador("Intel i7 Core");
        meuNotebook.atualizarArmazenamento("1TB");
        meuNotebook.instalarSistemaOperacional("Arch Linux");

        meuNotebook.exibirInformacoes();


        System.out.println("=== TESTE COM VALORES INVÁLIDOS ===");

        meuNotebook.atualizarProcessador("");           // inválido
        meuNotebook.atualizarArmazenamento("500");      // inválido
        meuNotebook.instalarSistemaOperacional(null);   // inválido

        meuNotebook.exibirInformacoes();
    }
}
