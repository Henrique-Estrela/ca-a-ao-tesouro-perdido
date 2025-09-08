public class I4 {
 public static void main(String[] args) {
        // Array de letras misteriosas
        char[] letras = {'H', 'I', 'J', 'K', 'L', 'M', 'N'};
        char pista = ' ';

        System.out.println("Procurando a letra especial...");

        for (int i = 0; i < letras.length; i++) { // loop correto
            System.out.println("Verificando letra: " + letras[i]);

            // Condição misteriosa: a letra especial está no índice 4
            if (i == 4) {
                pista = letras[i];
                System.out.println("Letra especial encontrada!");
                break;
            }
        }

        System.out.println("A pista secreta é: " + pista); // saída: L
    }
}
