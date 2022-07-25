package dio.poo.classes;

public class Car {
    private String color;
    private String model;
    private Double tankCapacity;

    public Car() {}

    public Car(String color, String model, Double tankCapacity) {
        this.color = color;
        this.model = model;
        this.tankCapacity = tankCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public Double valueFillTank(Double priceFuel) {
        return priceFuel * tankCapacity;
    }
}
