package edu.java.iphone;

import edu.java.iphone.equipamentos.AparelhoTelefonico;
import edu.java.iphone.equipamentos.NavegadorInternet;
import edu.java.iphone.equipamentos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Ligando para contato do iPhone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação do iPhone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do iPhone...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no iPhone...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página de internet no iPhone...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página atual no iPhone...");
    }
}
