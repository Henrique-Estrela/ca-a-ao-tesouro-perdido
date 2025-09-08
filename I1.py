# Desafio da Caça ao Tesouro
# Percorra o alfabeto e descubra quais letras formam a pista secreta.

alfabeto = ["a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"]

pista = ""

for i in range(len(alfabeto)):
    # Falta você completar aqui:
    if i == 13:   # dica: 14ª letra
        pista += alfabeto[i].upper()
    if i == 0:    # dica: 1ª letra
        pista += alfabeto[i]

print(pista)   # Saída esperada: Na
