person = {
    'name': 'Leonel',
    'last_name': 'Olivares',
    'langs': ['python', 'mysql', 'ruby'],
    'age': 24
}

print(person)

# podemos actualizar un diccionario
person['name'] = 'Javier'
person['age'] -= 10
person['langs'].append('java')
print(person)

# podemos eliminar elementos de un diccionario
del person['last_name']
person.pop('age')   # no podemos usar pop() sin argumentos en los diccionarios
print(person)

# podemos obtener las tuplas de llave-valor, las llaves o los valores
print(person.items())
print(person.keys())
print(person.values())