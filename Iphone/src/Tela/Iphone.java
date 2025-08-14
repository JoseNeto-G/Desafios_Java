package Tela;
import java.util.Scanner;
public class Iphone {
public static void main(String[] args) {
    int i=1;
    Scanner leitor = new Scanner(System.in);
    Musicas m = new Musicas();
    Telefone fone = new Telefone();
    Internet inter = new Internet();

    while(i==1){
    System.out.println("O que gostaria de fazer?");  
	String comando = leitor.nextLine();


    if (comando.equalsIgnoreCase("Musicas")){
       System.out.println("O que gostaria de fazer em Musicas?");
       String comando2 = leitor.nextLine();
        if(comando2.equalsIgnoreCase("Selecionar")){
        m.SelecionarMusica();
        }else if(comando2.equalsIgnoreCase("Tocar")){
        m.tocar();
        }else if(comando2.equalsIgnoreCase("Pausar")){
        m.pausar();
        }else{System.out.println("Acão não identificada");}

    } else if(comando.equalsIgnoreCase("Telefone")){
        System.out.println("O que gostaria de fazer em Telefone?");
        String comando2 = leitor.nextLine();
        if(comando2.equalsIgnoreCase("Ligar")){
        fone.ligar();
        }else if(comando2.equalsIgnoreCase("Atender")){
        fone.atender();
        }else if(comando2.equalsIgnoreCase("Correio")){
        fone.iniciarCorreioVoz();
        }else{System.out.println("Acão não identificada");}

    } else if(comando.equalsIgnoreCase("Internet")){
        System.out.println("O que gostaria de fazer na Internet?");
        String comando2 = leitor.nextLine();
        if(comando2.equalsIgnoreCase("Exibir")){
        inter.exibirPagina();
        }else if(comando2.equalsIgnoreCase("adicionar")){
        inter.adicionarNovaAba();
        }else if(comando2.equalsIgnoreCase("Atualizar")){
        inter.atualizarPagina();
        }else{System.out.println("Acão não identificada");}       
    } else{System.out.println("Acão não identificada");}
    System.out.println("Gostaria de fazer algo mais?");
    String proximoComando = leitor.nextLine();
    if(proximoComando.equalsIgnoreCase("Sim")){i=1;}else{i=0;}

    }    
  }
}
