package Tela;
import java.util.Scanner;

public class Telefone {
    private String numero;
    Scanner t = new Scanner(System.in);

    protected void ligar (){
    System.out.println("Para quem gostaria de ligar?");
    String numero = t.nextLine();
    System.out.println("Ligando para " + numero);
    }
    protected void atender (){
    System.out.println("Atendendo Ligação");
    }
    protected void iniciarCorreioVoz (){
    System.out.println("Gostaria de enviar um correio de voz?");
    String numero = t.nextLine();
        if(numero.equalsIgnoreCase("Sim")){
        System.out.println("Descreva sua mensagem após o sinal");
        String mensagem = t.nextLine();
        System.out.println("Mensagem " + mensagem + " enviada");
        }
    }
}
