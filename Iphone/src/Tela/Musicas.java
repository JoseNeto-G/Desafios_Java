package Tela;
import java.util.Scanner;
public class Musicas {
    private String m;
    Scanner c = new Scanner(System.in);

    protected void tocar (){
    if(m == null){
    System.out.println("Tocando musica no modo aleatório");
        }else{System.out.println("Tocando " + m);}
    }
    protected void pausar (){
    System.out.println("Gostaria de pausar a musica?");
    String acaoMusica = c.nextLine();
    if (acaoMusica.equalsIgnoreCase("Sim"))
    System.out.println("Musica Pausada");
    }
    protected void SelecionarMusica (){
    System.out.println("Qual musica gostaria de ouvir?");
    String musica = c.nextLine();
    System.out.println("Musica " + musica + " Selecionada");
    m = musica;
    tocar();
    }

}
