/*
algoritmo Aninhado
inteiro num, quad, i;
literal resp
resp = "s"
    início
        enquanto (resp == 's' ou resp == 'S') {
            escreva("Digite um numero");
            leia(num)
            para (i=0 i<=num, i++){
                quad = i*i
                escreva("Quadrado de " + i + " igual " + quad);
                }
            escreva("Deseja continuar?");
            leia(resp);
        }
    fim
 */

package anin.aninhado;
import java.util.Scanner;

public class Aninhado {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, quad, i;
    String resp = "s";
    while(resp.equals("s") || resp.equals("S")){
        System.out.println("Digite um numero");
        num = sc.nextInt();
        for(i=0 ; i<=num ; i++){
            quad = i*i;
            System.out.println("Quadrado de " + i + " igual " + quad);
            }
        System.out.println("Deseja continuar?");
        resp = sc.next();
    }
}
}