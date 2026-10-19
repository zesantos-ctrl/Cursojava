package atividade.poli2.entities;

public class ImportProduct extends Product {

    private double customsFee;

    public ImportProduct() {
    }

    public ImportProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override 
     public String priceTag() {
        return 
    }
}
