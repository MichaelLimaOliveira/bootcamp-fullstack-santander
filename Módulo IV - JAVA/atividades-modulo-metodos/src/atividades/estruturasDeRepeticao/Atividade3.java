package atividades.estruturasDeRepeticao;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int cont = 0;

        do {
            numero = scan.nextInt();
            if (numero > maior) maior = numero;

            cont++;
        }while(cont < 5);

        System.out.println(maior);
    }
}
