# los diccionarios son como las tablas hash, en lugar de usar posiciones para acceder a 
# un elemento usamos una llave o key.
my_dict = {}
print(type(my_dict))
my_dict = {
    'name': 'Leonel',
    'last_name': 'Olivares',
    'age': '24'
}
print(my_dict)
print(len(my_dict))

# podemos acceder a los elementos usando su llave
print(my_dict['age'])
print(my_dict['last_name'])

# si no estamos seguros de si existe una llave podemos usar el método get() para obtener
# un None en caso de que no exista
print(my_dict.get('name'))
print(my_dict.get('city'))

# otra forma de validar es con booleanos
print('sex' in my_dict)
print('age' in my_dict)