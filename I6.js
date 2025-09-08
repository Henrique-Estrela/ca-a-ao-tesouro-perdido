// 🏔️ Insígnia de Sequências e Loops
// Região: Montanhas do Loop

console.log("Explorando a sequência misteriosa...");

// Array de letras misteriosas
const letras = ['M', 'O', 'D', 'P', 'Q'];
let resultado = '';

for (let i = 0; i < letras.length; i++) {
    console.log("Verificando letra:", letras[i]);

    // Condição oculta: a letra especial está no índice 2
    if (i === 2) {
        resultado = letras[i]; // pista secreta
        console.log("Letra especial encontrada!");
        break;
    }
}

console.log("A pista secreta é:", resultado); // saída esperada: N
