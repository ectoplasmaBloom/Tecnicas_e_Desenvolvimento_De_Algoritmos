package calcimc.imc;

import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
    double peso, altura, imc;
    String saida;
    peso = Double.parseDouble(JOptionPane.showInputDialog(
            null, "Digite o seu peso em KG:"));
    altura = Double.parseDouble(JOptionPane.showInputDialog(
        null, "Digite a sua altura em m:"  ));
    imc = peso / (altura * altura);
    saida = String.format("Seu imc é %.2f kg/m2" , imc);
    JOptionPane.showMessageDialog(null, saida);
    System.out.printf(saida);
    }   
}
