package br.com.notebook.main;

import br.com.notebook.model.Notebook;

public class MainSystem {
    public static void main(String[] args) {
        Notebook myNotebook = new Notebook();
        myNotebook.processador = "Intel i7 Core";
        myNotebook.armazenamento = "1TB";
        myNotebook.os = "Arch Linux";

        Notebook yourNotebook = new Notebook();
        yourNotebook.processador = "AM Ryze 7 5700 R";
        yourNotebook.armazenamento = "500GB";
        yourNotebook.os = "Windows 11";
        
        System.out.println("--- Saida de dados: Notebooks ---");

        System.out.println("Meu notebook: V");
        System.out.println("O processador do meu notebook é um " + myNotebook.processador + ", ele possui um total de " + myNotebook.armazenamento + " de espaço e usa um " + myNotebook.os + " como sistema operacional.");
        System.out.println("Notebook do Professor: V");

        System.out.println("O processador do notebook do professor é um " + yourNotebook.processador + ", ele possui um total " + yourNotebook.armazenamento + " de espaço e usa um " + yourNotebook.os + " como sistema operacional.");
    }
}
