package dio.exception.unchecked;

import javax.swing.*;

public class AtividadesUncheckedExeption {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int result = Divisor(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println(result);
                continueLooping = false;
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Entrada inválida informe um número real !!!!! " + exception.getMessage());
                exception.printStackTrace();
            } catch (ArithmeticException exception) {
                JOptionPane.showMessageDialog(null, "Imposivel dividir por zero !!!!!!!!" + exception.getMessage());
                exception.printStackTrace();
            } finally {
                System.out.println("Chegou no finally");
            }

        }while (continueLooping);

        System.out.println("comcluido");
    }

    public static int Divisor(int a, int b) {
        return a / b;
    }
}
