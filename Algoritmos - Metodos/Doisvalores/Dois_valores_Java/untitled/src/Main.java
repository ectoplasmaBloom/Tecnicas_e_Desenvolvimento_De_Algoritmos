/*
algoritmo somarDoisValores
real x,y
    início
        escreva ("entre com o 1° valor:")
        leia (x)
        escreva ("entre com o 2° valor")
        leia (y)
        escreva ("a soma é" + somaDoisValores(x, y))
    fim

real somaDoisValores(real a, real b)
    retorne a+b
    fim
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o 1° valor: ");
        x = sc.nextFloat();
        System.out.println("Entre com o 2° valor: ");
        y = sc.nextFloat();
        System.out.println("a soma é " + somaDoisValores(x, y));
    }
    public static float somaDoisValores (float x, float y){
        return x + y;
    }
}
