
import java.util.Scanner;

public class Intervalos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            int x = teclado.nextInt();
            if (x >= 10 && 20 <= x) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        teclado.close();
    }

}
