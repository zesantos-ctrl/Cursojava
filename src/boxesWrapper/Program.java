public class Program {
    public static void main(String[] args) {
        int x = 20;

        // não precisa fazer casting, pois o compilador faz automaticamente
        Integer obj = x;
        System.out.println(obj);

        int y = obj * 2;
        System.out.println(y);
    }
}
