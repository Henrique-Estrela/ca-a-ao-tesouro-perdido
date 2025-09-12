// 🔢 Insígnia da Ordenação
// Região: Vale dos Números

function ordenarDigitosDecrescente(numero) {
    // Converte para string -> array -> ordena -> junta de volta
    return parseInt(
        numero
            .toString()
            .split('')
            .sort((a, b) => b - a)
            .join('')
    );
}

// Exemplos de uso
console.log(ordenarDigitosDecrescente(42145));      // Saída: 54421
console.log(ordenarDigitosDecrescente(145263));     // Saída: 654321
console.log(ordenarDigitosDecrescente(123456789));  // Saída: 987654321
