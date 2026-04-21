
package notas.decisao;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Decisao {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  JOptionPane.showInputDialog(
        null, "Digite sua nota:");
  float nota = sc.nextFloat();
    if (nota >=6){
        JOptionPane.showMessageDialog(null, "Parabéns!", "Aprovado!", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Aprovado");
        
        }
    sc.close();
    }
}
