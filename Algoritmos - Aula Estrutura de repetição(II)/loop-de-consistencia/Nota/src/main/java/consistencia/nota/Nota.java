/*
algoritmo Nota
    início
        faça{
            escreva("Digite a nota do aluno");
            leia(nota);
            se(nota<0 ou nota>10);
                escreva("A nota digitada é inválida! ")
        }
        enquanto(nota<0 ou nota>10)        
    fim
 */

package consistencia.nota;
import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota;
    do{
        System.out.println("Digite a nota do aluno");
        nota = sc.nextDouble();
        if(nota<0 || nota>10);
        System.out.println("A nota digitada e invalida!");
        }while(nota < 0 || nota > 10); 
    }
}

