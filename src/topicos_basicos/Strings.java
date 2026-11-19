package topicos_basicos;

public class Strings {
    public static void main(String[] args) {

        /*
         * Formatar: toLowerCase(), toUpperCase(),trim()
         * Recortar: substring(incio), substring(incio, fim)
         * Substituir: Replace(char, char), Replace(string, string)
         * Buscar: indexOf, LastIndexOf
         * str.split("")
         */

        String original = "abcde KSDKSD ABC abc DEFG   ";

        // Formatação
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();

        System.out.println("Original: - " + original + "-");
        System.out.println("toLowerCase: - " + s01 + "-");
        System.out.println("toUpperCase: - " + s02 + "-");
        System.out.println("trim: - " + s03 + "-");

        System.out.println();
        System.out.println("==================");
        System.out.println();

        // Recortar
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);

        System.out.println("Original: - " + original + "-");
        System.out.println("substring: - " + s04 + "-");
        System.out.println("substring: - " + s05 + "-");

        System.out.println();
        System.out.println("==================");
        System.out.println();

        // Substituir

        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xy");

        System.out.println("Original: - " + original + "-");
        System.out.println("replace: - " + s06 + "-");
        System.out.println("replace: - " + s07 + "-");

        System.out.println();
        System.out.println("==================");
        System.out.println();

        // Buscar
        int s08 = original.indexOf("bc");
        int s09 = original.lastIndexOf("bc");

        System.out.println("Original: - " + original + "-");
        System.out.println("indexOf: - " + s08 + "-");
        System.out.println("lastIndexOf: - " + s09 + "-");


        System.out.println();
        System.out.println("==================");
        System.out.println();

        // str.split("")
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
