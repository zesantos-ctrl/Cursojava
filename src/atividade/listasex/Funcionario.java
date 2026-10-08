package atividade.listasex;

public class Funcionario {
    private String name;
    private Integer id;
    private double salary;

    public Funcionario() {
    }

    public Funcionario(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override 
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
