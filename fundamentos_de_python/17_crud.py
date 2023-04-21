# CRUD son las siglas de Create, Read, Update y Delete que son cosas que podemos realizar
# con las listas
numbers = [1,2,3,4,5]   # Create
print(numbers[1])   # Read
numbers[-1] = 10    # Update
print(numbers)

# podemos agregar un nuevo elemento a la lista y este siempre se agregará al final de esta
numbers.append(700)
print(numbers)

# podemos agregar también el elemento en el lugar que queramos
numbers.insert(0, "hola")
numbers.insert(3, "change")
print(numbers)

# podemos concatenar listas solo usando el operador más (+)
tasks = ['todo1', 'todo2', 'todo3']
nueva_lista = numbers + tasks
print(nueva_lista)

# podemos obtener la posición del index de un elemento, siempre regresa la posición de la
# primera coincidencia.
index = nueva_lista.index('todo2')
nueva_lista[index] = 'todo changed'
print(nueva_lista)

# podemos eliminar elementos de una lista indicando el elemento, la primera coincidencia.
nueva_lista.remove('todo1')
print(nueva_lista)

# podemos eliminar el último elemento de una lista
nueva_lista.pop()
print(nueva_lista)

# podemos eliminar un elemento especifico dándole a pop() el index en el argumento
nueva_lista.pop(0)
print(nueva_lista)

# podemos invertir la lista
nueva_lista.reverse()
print(nueva_lista)

# podemos ordenar una lista
numbers_a = [1,4,6,3]
numbers_a.sort()
print(numbers_a)
strings_a = ['re', 'ab', 'ed']
strings_a.sort()
print(strings_a)

# NOTA: No podemos usar sort cuando tenemos una lista con tipos de datos mezclados ya que
# se creará un error