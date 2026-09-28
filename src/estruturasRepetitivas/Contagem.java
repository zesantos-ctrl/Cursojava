package estruturasRepetitivas;
public class Contagem {

    public static void main(String[] args) {
        /*

for (inicio; condição; incremento) {
    comando 1
    comando 2
}

inicio - Executa somente na primeira vez
condição:
  V - executa e volta
  F - pula fora
incremento - Executa toda vez depois voltar
         */

        //Incremento
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        }

        //Decremento
        for (int i = 10; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }

    }
}
