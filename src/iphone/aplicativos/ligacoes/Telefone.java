package iphone.aplicativos.ligacoes;

public class Telefone implements AparelhoTelefonico{
    
    public void ligar(){
    System.out.println("Realizando ligação.");
    }

    public void atender(){
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }
}
