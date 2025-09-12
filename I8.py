# 🔢 Insígnia da Ordenação
# Região: Vale dos Números

def ordenar_digitos_decrescente(numero):
    # Converte para string e depois lista de caracteres
    digitos = list(str(numero))
    
    # Ordena os dígitos em ordem decrescente
    digitos.sort(reverse=True)
    
    # Junta de volta em uma string e converte para inteiro
    return int("".join(digitos))


# Exemplos de uso
print(ordenar_digitos_decrescente(42145))      # Saída: 54421
print(ordenar_digitos_decrescente(145263))     # Saída: 654321
print(ordenar_digitos_decrescente(123456789))  # Saída: 987654321
