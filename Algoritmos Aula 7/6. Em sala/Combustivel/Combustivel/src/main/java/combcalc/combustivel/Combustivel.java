
/* algoritmo combustivel

real km, media, litros;

    inicio
    escreva("Qual a distância percorrida");
    leia (km);
    escreva("Qual foi o consumo do veículo");
    leia (litros);
    media = km / litros;
    escreva("A média foi: " + media +" Km/L");
    fim
*/

package combcalc.combustivel;
import java.util.Scanner;


public class Combustivel {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi a distancia percorrida?");
        double km = sc.nextDouble();
        System.out.println("Qual foi o consumo?");
        double litros = sc.nextDouble();
        double media = km / litros;
        System.out.println("A media foi: " + media +" Km/L");
    } 
}
