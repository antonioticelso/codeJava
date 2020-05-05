import javax.swing.*;

public class Aula12Modulo8 {

//    Estrutura de repetição do While
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Nota: ");
        String n2 = JOptionPane.showInputDialog("Nota: ");
        String n3 = JOptionPane.showInputDialog("Nota: ");
        String n4 = JOptionPane.showInputDialog("Nota: ");

        double dn1 = Double.parseDouble(n1);
        double dn2 = Double.parseDouble(n2);
        double dn3 = Double.parseDouble(n3);
        double dn4 = Double.parseDouble(n4);

        double media = (dn1 + dn2 + dn3 + dn4) / 4;

        if (media < 5) {
            JOptionPane.showMessageDialog(null, "A média do aluno é: "
                    + media);
            System.out.println("Aluno Reprovado");
        } else {
            if (media >= 7) {
                JOptionPane.showMessageDialog(null, "A média do aluno é: "
                        + media);
                System.out.println("Aluno Aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "A média do aluno é: "
                        + media);
                System.out.println("Aluno está de Recuperação");

            }

        }


    }

}


