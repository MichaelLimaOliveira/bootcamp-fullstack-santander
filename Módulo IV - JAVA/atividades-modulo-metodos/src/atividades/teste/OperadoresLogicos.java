package atividades.teste;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean verdade = true;
        boolean mentira = false;

        int i1 = 10;
        int i2 = 20;

        System.out.println((verdade && mentira));
        System.out.println((verdade || mentira));
        System.out.println((verdade ^ verdade));
        System.out.println((verdade ^ mentira));
        System.out.println((mentira ^ mentira));

        System.out.println((i1 < i2) && (i2 > i1) || verdade);
        System.out.println(!(i1 < i2) && !(i2 > i1) || !verdade);
        System.out.println(!(i1 < i2) && !(i2 > i1) || verdade);
        System.out.println((i1 > i2) && (i2 < i1) || !verdade);
        System.out.println((i1 > i2) && (i2 < i1) || verdade);

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        System.out.println(recebeAuxilio);

    }
}
