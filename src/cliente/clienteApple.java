package cliente;

import iphone.Iphone;
import iphone.aplicativos.ligacoes.Telefone;

public class clienteApple {

    public static void main(String[] args) {

    Iphone iphone = new Iphone();
    Telefone telefone = new Telefone();

    //Uilizando a classe de ligações instanciada pelo variavel iphone da classe Iphone.java
    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();

    //Uilizando a classe de reprodução musical instanciada pelo variavel iphone da classe Iphone.java
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();

    //Uilizando a classe de naveção na internet instanciada pelo variavel iphone da classe Iphone.java
    iphone.exibirPagina();
    iphone.adicionarNovaPagina();
    iphone.atualizarPagina();
    }    

}
