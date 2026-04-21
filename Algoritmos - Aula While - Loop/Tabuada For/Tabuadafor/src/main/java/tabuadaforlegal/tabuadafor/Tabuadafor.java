/*
 * algoritmo Tabuadafor
    inteiro numero, i
    inicio
        escreva("Digite um numero inteiro: ")
        leia(numero);
        para(i=0; <=10; i++){
            escreva (numero * i);
        }
    fim
 */

package tabuadaforlegal.tabuadafor;
import java.util.Scanner;

public class Tabuadafor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(numero * i);
        }
    }
}
