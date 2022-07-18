package atividades.metodos;

public class CalcularEmprestimo {
    public static  double retornaValorComJuros(double valor, double juros) {
        double valorTotal = valor + (valor * juros);
        return valorTotal;
    }

    public static double retornaJuros(int parcelas) {
        double juros;

        switch (parcelas){
            case 1:
                juros = 0.02d;
                break;
            case 2:
                juros = 0.03d;
                break;
            case 3:
                juros = 0.04d;
                break;
            default:
                juros = 0.0d;
                break;

        }

        return juros;
    }
}
