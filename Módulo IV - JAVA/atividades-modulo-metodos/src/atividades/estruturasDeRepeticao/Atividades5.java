package atividades.estruturasDeRepeticao;

public class Atividades5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[array.length - 1] - i + " ");
        }
    }
}
