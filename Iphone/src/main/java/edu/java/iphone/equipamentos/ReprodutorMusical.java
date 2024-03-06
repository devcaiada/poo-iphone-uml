package edu.java.iphone.equipamentos;

public interface ReprodutorMusical {

    public default void tocar() {
        System.out.println("Tocando música...");
    }

    public default void pausar() {
        System.out.println("Pausando música...");
    }

    public default void selecionarMusica() {
        System.out.println("Selecionando nova música...");
    }

}