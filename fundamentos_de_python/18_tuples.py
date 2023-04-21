# las tuplas son como las listas solo que no pueden ser modificadas desde su creación
numbers = (1,2,3,4)
strings = ('nico', 'zule', 'santi', 'nico')
print(numbers)
print(type(numbers))
print(strings)
print(type(strings))

# podemos navegar entre las tuplas igual que las listas usando indexing
print(numbers[0])
print(numbers[-1])

# las tuplas como mencionamos solo son de lectura así que todos los métodos de las
# listas que agregaban, quitaban o modificaban los elementos no las tienen las tuplas

# podemos obtener el index de un elemento
print(strings.index('zule'))

# podemos contar cuantos elementos iguales hay en una tupla y también funciona en las listas
print(strings.count('nico'))

# podemos hacer una transformación de tupla a lista y viceversa
mi_lista = list(numbers) # convertir a lista
print(mi_lista)
print(type(mi_lista))
mi_lista.append('5')
print(mi_lista)
mi_lista = tuple(mi_lista) # convertir a tupla
print(mi_lista)
print(type(mi_lista))