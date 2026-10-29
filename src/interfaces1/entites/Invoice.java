package interfaces1.entites;

public class Invoice {

    private double basicPayment;
    private double tax;

    public Invoice() {
    }

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        //Se houver mudanças aqui, no getTotalPayment ja esta pronto  
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
                                                                                                                                                                                                                                                                                                                                               
    public double getTotalPayment() {
        // usando get para facilitar mudanças no futuro  
        return getBasicPayment() + getTax();
    }
}
