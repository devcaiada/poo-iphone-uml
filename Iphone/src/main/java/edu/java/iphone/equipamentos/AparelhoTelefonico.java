package edu.java.iphone.equipamentos;

public interface AparelhoTelefonico {

    public default void ligar() {
        System.out.println("Efetuando chamada para contato...");
    }

    public default void atender() {
        System.out.println("Atendendo ligação...");
    }

    public default void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

}
