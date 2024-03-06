package edu.java.iphone.equipamentos.usuario;

import edu.java.iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {

        Iphone usuario = new Iphone();

        System.out.println("Música no iPhone");
        usuario.tocar();
        usuario.pausar();
        usuario.selecionarMusica();

        System.out.println("----------");

        System.out.println("Ligações no iPhone");
        usuario.atender();
        usuario.ligar();
        usuario.iniciarCorreioVoz();

        System.out.println("----------");

        System.out.println("Navegação no iPhone");
        usuario.exibirPagina();
        usuario.atualizarPagina();
        usuario.adicionarNovaAba();

        System.out.println("----------");

        System.out.println("Desligando aparelho...");

    }
}
