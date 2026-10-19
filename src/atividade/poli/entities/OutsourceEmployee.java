
package atividade.poli.entities;

public class OutsourceEmployee extends Employee {

    private double addCarge;

    public OutsourceEmployee() {
    }

    public OutsourceEmployee(String name, Integer hour, double perHour, double addCarge) {
        super(name, hour, perHour);
        this.addCarge = addCarge;
    }

    public double getAddCarge() {
        return addCarge;
    }

    public void setAddCarge(double addCarge) {
        this.addCarge = addCarge;
    }

    @Override
    public double payment() {
        return super.payment()  + addCarge * 1.1;
    }
}
