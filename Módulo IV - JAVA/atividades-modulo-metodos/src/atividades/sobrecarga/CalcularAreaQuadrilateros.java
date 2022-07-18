package atividades.sobrecarga;

public class CalcularAreaQuadrilateros {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double base, double altura) {
        return base * altura;
    }

    public static double area(double baseMenor, double baseMaior, double altura) {
        return (baseMaior + baseMenor) * altura / 2;
    }

}
