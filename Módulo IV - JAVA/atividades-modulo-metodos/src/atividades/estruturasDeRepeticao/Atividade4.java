package atividades.estruturasDeRepeticao;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero a ser calculado: ");
        int number = scan.nextInt();

        Calculator(number);

    }

    public static void Calculator(int number) {

        for (int i = 1; i <= 10; i++) {
            int tabuada = number * i;
            System.out.println(number + " X " + i + " = " + tabuada);
        }
    }
}
