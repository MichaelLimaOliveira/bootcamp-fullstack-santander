package br.com.dio.collections.map.atividadesPropostas;

import java.util.Random;

public class LancamentoDados {
    public static void main(String[] args) {
        Random random = new Random();

        int[] ladosDoDado = new int[6];

        for (int i = 0; i < 100; i++) {
            int resultadoDado = random.nextInt(1, 7);
            switch (resultadoDado) {
                case 1:
                    ladosDoDado[0]++;
                    break;
                case 2:
                    ladosDoDado[1]++;
                    break;
                case 3:
                    ladosDoDado[2]++;
                    break;
                case 4:
                    ladosDoDado[3]++;
                    break;
                case 5:
                    ladosDoDado[4]++;
                    break;
                case 6:
                    ladosDoDado[5]++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Foram Sorteados os lados as seguintes quantidades");
        System.out.println("lado 1: " + ladosDoDado[0]);
        System.out.println("lado 2: " + ladosDoDado[1]);
        System.out.println("lado 3: " + ladosDoDado[2]);
        System.out.println("lado 4: " + ladosDoDado[3]);
        System.out.println("lado 5: " + ladosDoDado[4]);
        System.out.println("lado 6: " + ladosDoDado[5]);

    }
}
