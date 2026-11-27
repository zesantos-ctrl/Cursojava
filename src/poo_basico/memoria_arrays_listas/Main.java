package memoria_arrays_listas;

public class Main {
    public static void main(String[] args) {

        // --- 1. DESALOCAÇÃO POR ESCOPO (MEMÓRIA STACK) ---
        {
            int p2 = 2893892; // Tipo primitivo: valor guardado direto na Stack
            int p = p2; // p recebe uma CÓPIA do valor de p2
            System.out.println(p);
            // FIM DO ESCOPO DO BLOCO:
            // p e p2 saem de escopo ao fechar a chave e o espaço na Stack é liberado.
            // O Garbage Collector NÃO atua sobre variáveis primitivas locais.
        }

        // --- 2. DESALOCAÇÃO PELO GARBAGE COLLECTOR (MEMÓRIA HEAP) ---
        {
            // Os objetos são criados no Heap; texto1 e texto2 (na Stack) guardam as
            // referências
            String texto1 = new String("Objeto A");
            String texto2 = new String("Objeto B");

            texto1 = texto2; // texto1 agora aponta para "Objeto B"
            // "Objeto A" ficou sem nenhuma referência apontando para ele:
            // virou "lixo" e se tornou ELEGÍVEL para o Garbage Collector.

            System.out.println(texto1); // Objeto B
        }
    }
}