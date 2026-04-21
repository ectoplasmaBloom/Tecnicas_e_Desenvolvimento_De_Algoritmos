/*
 algoritmo Impares
    início
        inteiro num, soma
        soma = 0
        faça {
            escreva("Digite um numero");
            leia(num)
            se (num % 2!= 0) {
                soma=soma+num
            }
        }
        enquanto(num!=0){
            escreva("A soma dos numeros impares e: " + soma)
            
        }
    fim
 */

package calcimpar.impares;
import java.util.Scanner;


public class Impares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma;
        soma = 0;
        do{ System.out.println("Digite um numero");
        num = sc.nextInt();
        if (num % 2!=0) {
            soma = soma + num;
        }
        }
       while(num != 0);
       System.out.println("A soma dos numeros impares e: " + soma);
    }
}

