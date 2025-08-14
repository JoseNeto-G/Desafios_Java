package Tela;
import java.util.Scanner;

public class Internet {
    private String url;
    Scanner u = new Scanner(System.in);

    protected void exibirPagina (){
    System.out.println("Qual a url da página?");
    String url = u.nextLine();
    System.out.println("Página " + url + " exibida");
    }
    protected void adicionarNovaAba (){System.out.println("Nova aba adicionada");}
    protected void atualizarPagina (){System.out.println("Pagina atualizada");}
}
