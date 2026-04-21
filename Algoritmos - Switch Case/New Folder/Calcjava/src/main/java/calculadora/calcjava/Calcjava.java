
package calculadora.calcjava;
import java.util.Scanner;

public class Calcjava {

    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Soma\n2Subtracao\n3-Multiplicacao\n4-Divisao\n5-Sair");
        op = sc.nextInt();
        switch (op) {
            case 1 -> System.out.println("Voce escolheu soma!");
            case 2 -> System.out.println("Voce escolheu subtraçco!");
            case 3 -> System.out.println("Voce escolheu multiplacacao!");
            case 4 -> System.out.println("Voce escolheu divisao");
            case 5 -> System.out.println("Obrigado por utilizar o programa!");
            default -> System.out.println("Opcao invalida");
        }
    }
}
