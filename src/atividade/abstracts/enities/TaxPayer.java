package atividade.abstracts.enities;

public abstract class TaxPayer {
    private String name;
    private double anualcome;

    public TaxPayer() {
    }

    public TaxPayer(double anualcome) {
        this.anualcome = anualcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualcome() {
        return anualcome;
    }

    public void setAnualcome(double anualcome) {
        this.anualcome = anualcome;
    }

}
