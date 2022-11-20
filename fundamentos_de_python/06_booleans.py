# Los booleanos nos ayuda a interpretar estados de verdadero o falso, como lo puede ser una
# variable que indica el estado civil del usuario.
is_single = True
print(type(is_single))
is_single = False
print(is_single)

# así como hay operadores para los números, también hay operadores para los valores booleanos.
# uno de ellos es el "not", el cual invierte el estado de un booleano.
print(not True)
print(not False)

is_single = not is_single
print(is_single)