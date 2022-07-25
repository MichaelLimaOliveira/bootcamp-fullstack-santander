package dio.exception.customizada;

import javax.swing.*;

public class CustomException {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

            try {
                if(numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("divisão não exata", denominador[i], numerador[i]);

                int result = numerador[i] / denominador[i];
                System.out.println(result);
            } catch (DivisaoNaoExataException exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, exception.getMessage());
            } catch (ArithmeticException exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não e posivel dividir por ZERO" + exception.getMessage());
            } catch (ArrayIndexOutOfBoundsException exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "O tamanho do numerador é "
                        + numerador.length
                        + " e o denominador é "
                        + denominador.length
                        + " imposivel dividir totamente seus respectivos conteudos");
            }


            System.out.println("The program is running here....");
        }
    }
}


