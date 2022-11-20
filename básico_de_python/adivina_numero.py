import random

def run():
    numero_aleatorio = random.randint(1,100)
    numero_usuario = int(input("Elige un número entre el 1 y el 100: "))

    while numero_aleatorio != numero_usuario:
        if numero_usuario < numero_aleatorio:
            print("Busca un número más grande.")
        else:
            print("Busca un número más pequeño")
        numero_usuario = int(input("Elige otro número: "))
    print("Ganaste!!! el número secreto es " + str(numero_aleatorio))


if __name__ == '__main__':
    run()