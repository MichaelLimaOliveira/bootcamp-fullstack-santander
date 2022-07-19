package atividades.estruturasDeRepeticao;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        do {
            nota = scan.nextInt();
        }while (nota < 0 || nota > 10);
    }
}
