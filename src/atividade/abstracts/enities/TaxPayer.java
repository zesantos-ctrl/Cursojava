package atividade.abstracts.enities;

public abstract class TaxPayer {
    private String name;
    private double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualcome() {
        return anualIncome;
    }

    public void setAnualcome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();
}
