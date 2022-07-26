package dio.poo.classes;

import dio.poo.interfaces.IOperacoesMatematicas;

public class Calculadora implements IOperacoesMatematicas {


    @Override
    public double soma(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double divisao(double n1, double n2) {
        return n1 / n2;
    }
}
