/*
algoritmo exemplo2
caractere msg
inteiro n
    início
        escreva("Digite um numero: ")
        leia (n)
        escreva("Digite um texto: ")
        leia(msg)
        exibirMensagem(msg,n)
    fim
void exibirMensagem(caractere texto, inteiro num)
        escreva ("Mensagem "+ texto + "numero"+ num)
    fim
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String msg;
    int n;
    System.out.println("Digite um numero: ");
    n = sc.nextInt();
    System.out.println("Digite um texto: ");
    msg = sc.next();
    exibirMensagem(msg,n);
    }
    static void exibirMensagem(String texto, int num){
        System.out.println("Mensagem "+ texto + " numero"+ num);
    }
}

