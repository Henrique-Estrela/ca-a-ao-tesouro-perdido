// 🔢 Insígnia da Ordenação
// Região: Vale dos Números

import java.util.Arrays;
import java.util.Collections;

public class I8 {
    public static int ordenarDigitosDecrescente(int numero) {
        // Converte o número para String
        String numStr = String.valueOf(numero);

        // Converte em array de caracteres
        Character[] digitos = new Character[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digitos[i] = numStr.charAt(i);
        }

        // Ordena em ordem decrescente
        Arrays.sort(digitos, Collections.reverseOrder());

        // Reconstrói o número
        StringBuilder resultado = new StringBuilder();
        for (char d : digitos) {
            resultado.append(d);
        }

        return Integer.parseInt(resultado.toString());
    }

    public static void main(String[] args) {
        System.out.println(ordenarDigitosDecrescente(42145));      // Saída: 54421
        System.out.println(ordenarDigitosDecrescente(145263));     // Saída: 654321
        System.out.println(ordenarDigitosDecrescente(123456789));  // Saída: 987654321
    }
}
