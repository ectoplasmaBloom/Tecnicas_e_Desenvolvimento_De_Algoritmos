/*
algoritmo fastfood
    inteiro cardapio
    
    inicio
        escreva("1- Hambúrguer( R$10 )\n2- Cachorro-quente( R$7 )\n3- Batata Frita ( R$ 5 )")
        leia (cardapio)
            escolha(cardapio){
                caso 1: 
                escreva("Voce escolheu: Hambúrguer\nValor a pagar: R$10.00");
                caso 2:
                escreva("Voce escolheu: Cachorro-quente\nValor a pagar: R$7.00");
                caso 3:
                escreva("Voce escolheu: Batata frita\nValor a pagar: R$5.00");
                padrão:
                    escreva("Não é um lanche valido");
        }
    fim
 */

package fastfoodswitch.fastfood;
import java.util.Scanner;

public class Fastfood {

    public static void main(String[] args) {

        System.out.println("1- Hambúrguer( R$10 )\n2- Cachorro-quente( R$7 )\n3- Batata Frita ( R$ 5 )");
        Scanner sc = new Scanner(System.in);
        int cardapio = sc.nextInt();
            switch(cardapio){
                case 1 -> System.out.println("Voce escolheu: Hambúrguer\nValor a pagar: R$10.00");
                case 2 -> System.out.println("Voce escolheu: Cachorro-quente\nValor a pagar: R$7.00");
                case 3 -> System.out.println("Voce escolheu: Batata frita\nValor a pagar: R$5.00");
            default -> System.out.println("Não é um lanche valido");
            }
            
        
    }
}
