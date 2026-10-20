package abstrato.entities;

import abstrato.enums.Color;

public class Rectangle extends Shape {
    private double width;
    private double hiegth;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double width, double hiegth) {
        super(color);
        this.width = width;
        this.hiegth = hiegth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHiegth() {
        return hiegth;
    }

    public void setHiegth(double hiegth) {
        this.hiegth = hiegth;
    }

    @Override
    public double area() {
        return width * hiegth;
    }

}
