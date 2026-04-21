/*
 * algoritmo Tabuada
    inteiro numero
    início
        escreva("Digite um numero inteiro: ");
        leia(numero);
        escreva (numero * 0);
        escreva (numero * 1);
        escreva (numero * 2);
        escreva (numero * 3);
        escreva (numero * 4);
        escreva (numero * 5);
        escreva (numero * 6);
        escreva (numero * 7);
        escreva (numero * 8);
        escreva (numero * 9);
        escreva (numero * 10);
    fim
 */

package tabuadalegal.tabuada;
import java.util.Scanner;


public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        System.out.println(numero * 0);
        System.out.println(numero * 1);
        System.out.println(numero * 2);
        System.out.println(numero * 3);
        System.out.println(numero * 4);
        System.out.println(numero * 5);
        System.out.println(numero * 6);
        System.out.println(numero * 7);
        System.out.println(numero * 8);
        System.out.println(numero * 9);
        System.out.println(numero * 10);
        
        
    }
}
