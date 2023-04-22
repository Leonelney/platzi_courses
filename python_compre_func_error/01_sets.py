# los conjuntos agrupa elementos que tienen algo en común.
# un conjunto se puede modificar, no tienen un orden y no permite duplicados.
# los conjuntos se crean con corchetes al igual que los diccionarios, pero sin tener un par
# de llave y valor.
set_countries = {'col', 'mex', 'bol', 'mex'}
print(set_countries)    # se repite 'mex' pero al ser un set borra los repetidos automáticamente
print(type(set_countries))

set_types = {1, 'hola', False, 12.12}
print(set_types) # no importa el orden

# podemos crear un set a partir de un string
set_from_string = set('hooola')
print(set_from_string)

# podemos crear un set a partir de una tupla
set_from_tuples = set(('abc', 'cbv', 'as', 'abc'))
print(set_from_tuples)

# podemos crear un ser a partir de una lista
numbers = [1,2,3,1,2,3,4]
set_numbers = set(numbers)  # las forma más sencilla en python de obtener las valores únicos de una lista o tupla es con set()
print(set_numbers)
