
package calchoraextra.horaextra;
import java.util.Scanner;

public class Horaextra {

    public static void main(String[] args) {
        int op, horas;
        float extra1, extra2; 
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Segunda\n2- Terça\n3- Quarta\n4- Quinta\n5- Sexta\n6- Sabado\n7- Domingo\n");
        op = sc.nextInt();
            switch (op){
                case 1: case 2: case 3: case 4: case 5: 
                    System.out.println("Escreva a hora trabalhada");
                    horas = sc.nextInt();
                    extra1 = horas*15;
                    System.out.println("Voce sera pago R$"+extra1+"");
                case 6: case 7: 
                    System.out.println("Escreva a hora trabalhada");
                    horas = sc.nextInt();
                    extra2 = (horas * 15) * 1.5f;
                    System.out.println("Voce sera pago R$"+extra2+ "em reais");
                default: 
                    System.out.println("Não é um dia válido");
            }
    }
}
