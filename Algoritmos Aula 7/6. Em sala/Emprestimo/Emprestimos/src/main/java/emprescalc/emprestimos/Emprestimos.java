/**algoritmo Emprestimo;
real salario, pendencias;    
    inicio
    escreva("Escreva seu sálario: ");
    leia (salario);
    escreva("Quantas foram as pendencias?");
    leia (pendencias);  
            se(pendencias>=2){
            escreva("Emprestimo não aprovado!");   
        }
            se(pendencias=1){
                se (salario>=2500){
                escreva("Empréstimo aprovado!");
                }
                se (salario<2500){
                escreva("Emprestimo nao aprovado!")
                }
        }
    
    fim
 

 */

package emprescalc.emprestimos;
import java.util.Scanner;


public class Emprestimos {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva seu salario");
        double salario = leia.nextDouble();
        System.out.println("Quantas foram as pendências?");
        double pendencias = leia.nextDouble();
        if (pendencias>=2){
            System.out.println("Emprestimo nao aprovado!");
        }            
        if (pendencias<=1){
            if (salario>=2500){
            System.out.println("Emprestimo aprovado!");
            }
            if (salario<2500){
            System.out.println("Emprestimo nao aprovado!");
            }
        }
    }
  
}
