'''
Este es un proyecto donde averiguaremos si la frase que introdusca el usuario es un palindromo.
Un palindromo es una frase o palabra que se lea igual al derecho y al revés.
'''
def es_palindromo(frase):
    al_derecho = frase.strip().lower().replace(" ", "")
    al_reves = frase.strip().lower().replace(" ", "")[::-1]
    if al_derecho == al_reves:
        return True
    else:
        return False


def run():
    frase_usuario = input("Escribe una frase o palabra: ")
    if es_palindromo(frase_usuario):
        print("Es un palindromo.")
    else:
        print("No es un palindromo.")


if __name__ == '__main__':
    run()