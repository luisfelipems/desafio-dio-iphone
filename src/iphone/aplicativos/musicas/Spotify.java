package iphone.aplicativos.musicas;

public class Spotify implements ReprodutorMusical{

    public void tocar(){
        System.out.println("Tocando música.");
    }

    public void pausar(){
        System.out.println("Pausando música.");
    }

    public void selecionarMusica(){
        System.out.println("Selecionado música.");
    }
}
