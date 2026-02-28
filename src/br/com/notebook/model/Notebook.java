package br.com.notebook.model;

public class Notebook {

    private String processador;
    private String armazenamento;
    private String os;

    // Método 1 - Atualizar Processador
    public void atualizarProcessador(String novoProcessador) {
        if (novoProcessador != null && !novoProcessador.isEmpty()) {
            this.processador = novoProcessador;
            System.out.println("Processador atualizado com sucesso!");
        } else {
            System.out.println("Erro: Processador inválido.");
        }
    }

    // Método 2 - Atualizar Armazenamento
    public void atualizarArmazenamento(String novoArmazenamento) {
        if (novoArmazenamento != null && novoArmazenamento.matches("\\d+(GB|TB)")) {
            this.armazenamento = novoArmazenamento;
            System.out.println("Armazenamento atualizado com sucesso!");
        } else {
            System.out.println("Erro: Armazenamento inválido. Use formato como 500GB ou 1TB.");
        }
    }

    // Método 3 - Instalar Sistema Operacional
    public void instalarSistemaOperacional(String novoSO) {
        if (novoSO != null && !novoSO.isEmpty()) {
            this.os = novoSO;
            System.out.println("Sistema Operacional instalado com sucesso!");
        } else {
            System.out.println("Erro: Sistema Operacional inválido.");
        }
    }

    // Método auxiliar para exibir dados
    public void exibirInformacoes() {
        System.out.println("Processador: " + processador);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Sistema Operacional: " + os);
        System.out.println("-----------------------------------");
    }
}
