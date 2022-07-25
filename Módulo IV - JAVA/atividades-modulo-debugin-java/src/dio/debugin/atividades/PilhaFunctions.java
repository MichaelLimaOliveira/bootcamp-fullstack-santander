package dio.debugin.atividades;

import java.util.Stack;

public class PilhaFunctions {
    public static void main(String[] args) {
        System.out.println("Iniciou o metodo main");
        a();
        System.out.println("Finalizou o metodo main");
    }

    public static void a() {
        System.out.println("Iniciou o metodo a");
        b();
        System.out.println("finalizou o metodo a");
    }

    public  static void b() {
        System.out.println("iniciou o metodo b");
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("finalizou metodo b");
    }

    public static void c() {
        System.out.println("iniciou o metodo c");
        Thread.dumpStack();
        System.out.println("Finalizou metodo c");
    }
}
