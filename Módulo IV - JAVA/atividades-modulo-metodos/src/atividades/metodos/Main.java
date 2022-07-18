package atividades.metodos;

import static atividades.metodos.Calculadora.*;
import static atividades.metodos.CalcularEmprestimo.retornaJuros;
import static atividades.metodos.CalcularEmprestimo.retornaValorComJuros;
import static atividades.metodos.SaudacoesDiarias.comprimentarPeloHorario;
import static atividades.metodos.VerificarPeriodoDoDia.retornarFrasePeloHorario;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double valor = 2000;

        System.out.println(somar(a, b));
        System.out.println(subtrair(a, b));
        System.out.println(multiplicar(a, b));
        System.out.println(dividir(a, b));

        System.out.println(comprimentarPeloHorario(retornarFrasePeloHorario(8)));

        System.out.println(retornaValorComJuros(valor, retornaJuros(3)));
    }
}
