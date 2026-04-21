/*
algoritmo desconto;
real produto, desconto;
    inicio
    escreva("Digite o valor do produto:");
    leia (produto);
    desconto = produto-(produto*0,1);
    escreva("Valor com desconto: R$" +desconto); 
    fim
*/

package descontocalc.desconto;
import java.util.Scanner;


public class Desconto {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do produto:"); 
        double produto = leia.nextDouble();
        double desconto = produto-(produto*0.1);
        System.out.println("Valor com desconto: R$" +desconto);
    }
}
