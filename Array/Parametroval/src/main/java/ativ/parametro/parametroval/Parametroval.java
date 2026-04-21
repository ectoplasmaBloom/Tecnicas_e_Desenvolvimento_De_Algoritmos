/*
algoritmo Salario-versaoA
    início
    real salario
        escreva("Digite o salário do funcionário: ")
        leia(salario)
        escreva("O salário do funcionário antes do método é"+ salario)
        calculaAumento(salario)
        escreva("O salário do funcionário após o método é: "+ salario)
    fim
real void calculaAumento(real salario)
    salario = salario * 1.03
    fim
 */

package ativ.parametro.parametroval;
import java.util.Scanner;


public class Parametroval {

    public static void main(String[] args) {
        double salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        salario = sc.nextDouble();
        System.out.println("O salário do funcionário antes do método é"+ salario);
        calculaAumento(salario);
        System.out.println("O salário do funcionário após o método é: "+ salario);      
    }
    public static void calculaAumento(double salario){
        salario = salario * 1.03;
    }
}
