package dio.debugin.atividades;

import javax.swing.*;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaDaTurma(alunos, scan);

        System.out.println("Média da turma" + media);
    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            Double parsedNota = 0.0;
            boolean continueParse = true;

            do {
                try {
                    System.out.println("Nota do aluno: " + aluno);
                    String nota = scanner.next();
                    parsedNota = Double.parseDouble(nota);
                    continueParse = false;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um numero real !!!!!");
                }
            } while (continueParse);

            soma += parsedNota;
        }

        return soma / alunos.length;
    }
}
