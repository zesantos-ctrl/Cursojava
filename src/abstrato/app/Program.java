package abstrato.app;

import java.util.ArrayList;
import java.util.Scanner;

import abstrato.entities.Circle;
import abstrato.entities.Rectangle;
import abstrato.entities.Shape;
import abstrato.enums.Color;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter ther number of shapes: ");
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Shape #" + i + "data:");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = teclado.next().charAt(0);
            System.out.println("Color (BLACK/ BLUE / RED): ");
            Color color = Color.valueOf(teclado.next());
            if (ch == 'r') {
                System.out.println("width: ");
                double width = teclado.nextDouble();
                System.out.println("heigth: ");
                double heigth = teclado.nextDouble();
                list.add(new Rectangle(color, width, heigth));
            } else {
                System.out.println("Radius: ");
                double radius = teclado.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.println(shape.area());
        }
        teclado.close();
    }
}
