# declaración de una variable con un valor int
number = 5
flotante = 4.3
# se usa puts para imprimir cosas en consola.
# todo es una clase, por lo que se pueden usar metodos sobre
# los números.
# variable.class regresa el tipo de dato de la variable.
puts number.class
puts flotante.class
# variable.methods lista todos los metodos de la variable.
# puts number.methods
# number.odd? regresa un booleano que indica si el valor es
# impar, de manera inversa esta number.even?
puts number.odd?
puts number.even?
# en los metodos se usa el signo de interrogración por que el
# lenguaje es muy parecido al ingles para comodidad del
# programador.

# Ruby siempre mantiene la parte entera en una división si los
# valores son enteros, para corregir ese comportameinto se
# debe convertir los int a float.
puts 4 / 5
puts 4 / 5.0