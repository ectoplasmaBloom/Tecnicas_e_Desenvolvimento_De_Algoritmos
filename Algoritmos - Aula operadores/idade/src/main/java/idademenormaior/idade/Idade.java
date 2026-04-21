package idademenormaior.idade;
import java.util.Scanner;


public class Idade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int x = sc.nextInt();
        if(x>=18){
            System.out.println("Maior de idade");   
        }
        else {
            System.out.println("Menor de idade");
        }
        sc.close();
    }
}
