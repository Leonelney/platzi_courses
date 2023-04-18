# las listas son estructuras de datos que nos permiten almacenar elementos, estos pueden 
# ser de un mismo tipo o de diferentes tipos. Se utiliza corchetes para inicializar una 
# lista y las comas para separar los elementos de esta.
numbers = [1, 2, 3, 4]
print(numbers)
print(type(numbers))
types = [1, True, "Hola mundo", 2.3]
print(types)
print(type(types))

# podemos usar el indexing para poder navegar entre los elementos de una lista
print("Este es el primer elemento de la lista types:", types[0])
print("Este es el segundo elemento de la lista types:", types[1])
print("Este es el tercer elemento de la lista types:", types[2])
print("Este es el cuarto elemento de la lista types:", types[3])

# con las listas podemos modificar sus elementos o cambiarlos por otro elemento al 
# contrario de un string
types[0] = 10
print("La nueva lista types es:", types)
types[0] = "Mi nombre es Leonel"
print("La nueva lista types es:", types)

# podemos usar los slicing en las listas también
print(numbers[:3])

# podemos preguntar si hay algún elemento dentro de una lista
print(True in types)
print("mundo" in types)