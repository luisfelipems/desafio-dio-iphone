package iphone.aplicativos.navegador;

public class Safari implements NavegadorInternet{

    public void exibirPagina(){
        System.out.println("Exibindo página.");
    }

    public void adicionarNovaPagina(){
        System.out.println("Adicionando página.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }
}
