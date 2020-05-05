import javax.swing.*;

public class Aula10Modulo8 {

//    Estrutura de opções
    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Informe quantos carros: ");
        String pessoas = JOptionPane.showInputDialog("Informe quantas pessoas: ");
        System.out.println("Temos " + carros + " carros.");
        System.out.println("Temos " + pessoas + " pessoas sem carros.");

        double carroNu = Double.parseDouble(carros);
        double pessoaNu = Double.parseDouble(pessoas);
        double resto = (carroNu % pessoaNu);


        int compartilhar = (int) (carroNu/pessoaNu);
        System.out.println("Temos " + compartilhar + " carro por pessoas." +
                "\nE sobra " + resto + " de carro");

        int resposta = JOptionPane
                .showInternalConfirmDialog(null, "Deseja ver " +
                "o resultado da operação?");

        if (resposta == 0) {
            JOptionPane.showInputDialog(null, "Divisão para pessoas deu "
                    + compartilhar + " e sobrou " + resto + " carros.");

        } else {
            System.out.println("Não vai ver nada!");
        }

    }

}


