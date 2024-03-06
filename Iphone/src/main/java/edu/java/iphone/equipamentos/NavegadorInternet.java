package edu.java.iphone.equipamentos;

public interface NavegadorInternet {

    public default void exibirPagina() {
        System.out.println("Exibindo página de internet...");
    }

    public default void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    public default void atualizarPagina() {
        System.out.println("Atualizando página atual...");
    }
}