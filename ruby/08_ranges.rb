# los rangos es como usar la función range() de python, generan una lista iterable
# de números para usarlo dentro de una función for por ejemplo.

# se define entre parentesis y con dos puntos
rango = (1..6)
puts rango
# tiene su propio tipo de dato
puts rango.class
# podemos convertirlo a un array
puts rango.to_a

# hay dos formas de crear rangos, incluyentes y excluyentes del último número
# del 1 al 6
puts (1..6).to_a
# del 1 al 5
puts (1...6).to_a