package br.com.dio.collections.list.atividades;

public class Month {
    private String monthName;
    private Double Temperature;

    public Month(String monthName, Double temperature) {
        this.monthName = monthName;
        Temperature = temperature;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Double getTemperature() {
        return Temperature;
    }

    public void setTemperature(Double temperature) {
        Temperature = temperature;
    }

    @Override
    public String toString() {
        return "Month{" +
                "monthName='" + monthName + '\'' +
                ", Temperature=" + Temperature +
                '}';
    }
}
