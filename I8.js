// 🏜️ Insígnia de Padrões e Arrays
// Região: Deserto dos Arrays

console.log("Explorando o Deserto dos Arrays...\n");

// Sequência misteriosa, com um elemento faltante
let sequencia = ["lab 108", "lab 23", "lab 3", null, "lab 1"];

console.log("Sequência atual:");
sequencia.forEach(item => {
    console.log(item !== null ? item : "???");
});

// Descobrir o elemento faltante de forma lógica
// Vamos extrair o número do elemento anterior e somar 1
let numeroAnterior = parseInt(sequencia[2].split(" ")[1]);
let elementoFaltante = "lab " + (numeroAnterior + 1);
sequencia[3] = elementoFaltante;

console.log("\nSequência completa:");
sequencia.forEach(item => console.log(item));

console.log("\nA resposta do desafio é:", sequencia[3]); // saída: lab 4
