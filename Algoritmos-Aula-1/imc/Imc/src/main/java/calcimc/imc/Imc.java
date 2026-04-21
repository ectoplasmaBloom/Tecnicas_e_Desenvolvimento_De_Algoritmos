
package calcimc.imc;
import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso");
        float peso = sc.nextFloat();
        System.out.println("Digite sua altura");
        float altura = sc.nextFloat();
        float imc = peso / (altura * altura);
        System.out.println("O seu imc é " + imc + "kg/m²");
        if (imc <20){
            System.out.println("Abaixo do peso");
    }
     else if (imc <25){
        System.out.println("Peso normal");
    }
    else if (imc <30){
        System.out.println("Sobre preso");
    }
    else if (imc <40){
        System.out.println("Obeso");
    }
    else{
        System.out.println("Obeso Mórbido");
    }    
        sc.close();
    }
}
