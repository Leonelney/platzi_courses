'''
Este programa es un conversor de monedas.
Convierte una cantidad de pesos colombianos, argentinos o mexicanos a dolares.

Las cantidades para convertir estan actualizadas a 29 de enero de 2022.
'''

def conversor(tipo_pesos, valor_dolar):
    pesos = float(input("Cuantos pesos " + tipo_pesos + " quiere convertir a dolares?: "))
    resultado = str(pesos) + " pesos " + tipo_pesos + " son equivalentes a " + str(round(pesos*valor_dolar,2)) + " dolares."
    return resultado

menu = """
Bienvenido al conversor de monedas.

1 - Pesos colombianos
2 - Pesos argentinos
3 - pesos mexicanos

Elige una opción: """
dolar_a_peso_colombiano = 0.00025
dolar_a_peso_argentino = 0.0095
dolar_a_peso_mexicano = 0.048

operacion = input(menu)
if operacion == "1":
    print(conversor("colombianos", dolar_a_peso_colombiano))
elif operacion == "2":
    print(conversor("argentinos", dolar_a_peso_argentino))
else:
    print(conversor("mexicanos", dolar_a_peso_mexicano))