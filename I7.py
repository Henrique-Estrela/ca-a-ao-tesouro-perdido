# 🏰 Insígnia de Criptografia
# Região: Castelo Codificado - com alfabeto

print("Mensagem misteriosa recebida... Tentando decifrar!\n")

# Array do alfabeto (não revela a palavra)
alfabeto = list("abcdefghijklmnopqrstuvwxyz")

# Loop visual para distrair
for i in range(1, 11):
    print("Decifrando letra..." if i % 2 == 0 else "Processando...")

# Construção camuflada da palavra usando índices do alfabeto
indices = [15, 4, 6, 0, 3, 8, 13, 7, 0]  # correspondem às letras da palavra
pista = "".join([alfabeto[i] for i in indices])

print("\nDecodificação completa!")
print("A pista secreta é:", pista)  # saída: pegadinha
