package arquivos;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strpath = teclado.nextLine();

        File path = new File(strpath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strpath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);


        teclado.close();
    }
}
