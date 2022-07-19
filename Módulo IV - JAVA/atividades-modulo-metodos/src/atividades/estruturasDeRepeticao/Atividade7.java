package atividades.estruturasDeRepeticao;

import java.util.Random;

public class Atividade7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayRandom = new int[10];
        int cont = 0;
        int sorteado =0;
        while (cont < 100) {
            for (int i = 0; i < 10; i++) {
                int numero = random.nextInt(100);
                arrayRandom[i] = numero;
                System.out.print(arrayRandom[i] + " ");

                if(arrayRandom[i] == 2){
                    sorteado++;
                }
            }
            System.out.println();
            cont++;
        }

        System.out.println(sorteado);
    }
}
