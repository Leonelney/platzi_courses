# los ciclos son las primeras estructuras de control que nos ayudarán a no repetir código
# while nos permite ejecutar un bloque de código hasta que la condición de entrada deje 
# de ser valida.

# Un while true es un ciclo infinito por lo que nunca se detendrá por que la condición 
# siempre es valida.
'''
while True:
    print('se esta ejecutando')
'''

# podemos usar un contador para poder contar las iteraciones y crear una condición de 
# salida a partir de ella
'''counter = 0
while counter < 10:
    counter += 1
    print(counter)'''

# podemos usar la palabra reservada 'break' para acabar con un while
'''counter = 0
while True:
    counter += 1
    print(counter)
    if counter == 15:
        break'''

# podemos usar la palabra reservada 'continue' para saltar a la siguiente iteración 
# ignorando el resto del código
counter = 0
while True:
    counter += 1
    if counter % 2 == 0:
        continue            # estamos solo imprimiendo los números impares
    print(counter)
    if counter == 15:
        break