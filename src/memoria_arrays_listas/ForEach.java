package memoria_arrays_listas;

public class ForEach {
    public static void main(String[] args) {

        String[] vect = new String[] { "Maria", "Joao", "Ana" };

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------------------");

        for (String nomes : vect) {
            System.out.println(nomes);
        }
    }
}
