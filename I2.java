import java.util.ArrayList;

public class I2 {
    public static void main(String[] args) {
        // Criando a "fila misteriosa" com algumas letras
        ArrayList<Character> fila = new ArrayList<>();
        fila.add('C');
        fila.add('B');
        fila.add('A');
        fila.add('D');
        fila.add('E');

        System.out.println("Percorrendo a fila misteriosa...");

        // Vamos percorrer a fila, mas só revelar a pista em uma condição oculta
        char pista = ' ';
        for (int i = 0; i < fila.size(); i++) {
            System.out.println("Verificando letra: " + fila.get(i));

            // Condição misteriosa: a pista é a letra que tem índice 2
            if (i == 2) { 
                pista = fila.get(i); // aqui a pista será "A"
                System.out.println("Letra especial encontrada!");
                break;
            }
        }

        System.out.println("A pista secreta é: " + pista); // Saída esperada: A
    }
}
