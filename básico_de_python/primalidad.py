def factorial(numero):
    if numero == 1 or numero == 0:
        return 1
    return numero * factorial(numero-1)


def es_primo(numero):
    # if numero == 1:
    #     return False
    # for i in range(1, numero + 1):
    #     if i == 1 or i == numero:
    #         continue
    #     elif numero % i == 0:
    #         return False
    # return True
    if (factorial(numero-1) + 1) % numero == 0:
        return True
    else:
        return False


def run():
    numero = int(input('Escribe un número: '))
    if es_primo(numero):
        print('Es primo.')
    else:
        print('No es primo.')


if __name__ == '__main__':
    run()