package atividade.poli.entities;

public class Employee {

    private String name;
    private Integer hour;
    private double perHour;

    public Employee() {
    }

    public Employee(String name, Integer hour, double perHour) {
        this.name = name;
        this.hour = hour;
        this.perHour = perHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double getPerHour() {
        return perHour;
    }

    public void setPerHour(double perHour) {
        this.perHour = perHour;
    }

    public double payment() {
        return hour * perHour;
    }
}
