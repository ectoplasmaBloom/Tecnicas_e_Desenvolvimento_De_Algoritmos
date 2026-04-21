/*
 * algoritmo Somatoria
    real n1, soma
    inteiro i 
    inicio  
    soma=0
    para (i=1; i<=10;i++){
        escreva("Digite um número: ");
        leia(n1);
        soma=soma+n1;
    }
    escreva("A somatória é: " + soma);
    fim
 */

package somalegalmuitolegal.somatoria;
import java.util.Scanner;

public class Somatoria {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float soma = 0;
    for (int i=1; i<=10; i++){
       System.out.println("Digite um número: ");
       float n1 = sc.nextFloat();
       soma=soma+n1;
    }
    System.out.println("A somatória é: " + soma);
            
    }
}
