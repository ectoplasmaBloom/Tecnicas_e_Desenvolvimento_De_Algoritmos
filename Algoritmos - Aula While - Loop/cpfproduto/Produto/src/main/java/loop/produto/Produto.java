/*
 *  algoritmo Produto
    literal cpf
    real preco, total
    inicio 
        total = 0
        preco = 1
        escreva ("Digite o seu cpf: ");
        leia (cpf);
        enquanto(preco != 0){
            escreva ("Digite o preço do produto: ");
            leia(preco);
            total += preco;
        }
        escreva("Cliente: "+ cpf);
        escreva("Total a pagar: R$ " + total);
    fim
 */

package loop.produto;
import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double preco = 1;
        System.out.println("Digite o seu cpf: ");
        String cpf = sc.nextLine();
        while(preco != 0) {
            System.out.println("Digite o preço do produto: ");
            preco = sc.nextDouble();
            total += preco;
        }
        System.out.println("Cliente: "+ cpf);
        System.out.println("Total a pagar: R$ " + total);
    }
}
