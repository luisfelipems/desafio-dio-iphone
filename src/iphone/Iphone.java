package iphone;

import iphone.aplicativos.ligacoes.AparelhoTelefonico;
import iphone.aplicativos.musicas.ReprodutorMusical;
import iphone.aplicativos.navegador.NavegadorInternet;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    public void exibirPagina(){
        System.out.println("Exibindo página no Iphone.");
    }

    public void adicionarNovaPagina(){
        System.out.println("Adicionando página no Iphone.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página no Iphone.");
    }

    public void tocar(){
        System.out.println("Tocando música no Iphone.");
    }

    public void pausar(){
        System.out.println("Pausando música no Iphone.");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando música no Iphone.");
    }

    public void ligar(){
        System.out.println("Ligando pelo Iphone.");
    }

    public void atender(){
        System.out.println("Atendendo ligação pelo Iphone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Abrindo o correio de voz pelo Iphone");
    }

}
 