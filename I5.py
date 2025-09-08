# 🏰 Insígnia de Condicionais
# Região: Planícies If/Else

pedido = "especial"  # tipo de pedido misterioso
resposta = ""

print("Processando pedido...")

if pedido == "especial":
    resposta = "A"  # condição secreta
    print("Condição especial atendida!")
elif pedido == "comum":
    resposta = "B"
    print("Condição comum atendida!")
else:
    resposta = "C"
    print("Condição padrão atendida!")

print("A letra resultante é:", resposta)  # saída esperada: A
