package atividades.estruturasDeRepeticao;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        int idade = 0;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

            if(nome == "0") {
                break;
            }
        }

    }
}
