package dio.poo.main;

import dio.poo.classes.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("red", "fiat", 202.4);

        System.out.println("Qual a cor do carro: " + car.getColor());
        System.out.println("Qual o modelo do carro: " + car.getModel());

        car.setColor("blue");
        System.out.println("Mudei a cor do meu carro para: " + car.getColor());

        Double full = 8.50;
        System.out.println("quanto custa para encher o tanke com a galosina a " + full + ": " + car.valueFillTank(full));

    }
}
