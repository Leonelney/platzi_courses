# usamos los corchetes para crear arrays.
letras = ["a", "b", "c"]
puts letras.class
# podemos obtener facilmente el número de elementos de un array con el metodo size.
puts letras.size
# se accede facilmente a cada elemento de un array indicando el indice.
puts letras[0]
puts letras[1]
puts letras[2]
# se puede usar la ubicación negativa para obtener un valor del array.
puts letras[-1]
puts letras[-2]
puts letras[-3]
# que pasa si buscamos un elemento que no existe
puts letras[3] # regresa un valor nil que es como el null
# también podemos saber si un elemento esta dentro de un array.
puts letras.include? "b"
puts letras.include? "d"
# apuntadores directos a ciertos elementos de un array.
puts letras.first
puts letras.last
# podemos crear lambdas para algunos metodos
# en este caso usamos el metodo count para contar todos los valores del array que cumplan
# la condición.
puts letras.count { |x| x == "a" }
puts [1,2,3,4,5].count { |x| x.even? }
# también tenemos el metodo map para aplicar alguna operación a todos los valores del array
puts [1,2,3,4,5].map { |x| x ** 2 }
# tenemos el metodo select que es el filter de ruby
puts [1,2,3,4,5].select { |x| x > 2 }
# para arrays con numeros tenemos metodos de max, min, sum
puts [1,2,3,4,5].min
puts [1,2,3,4,5].max
puts [1,2,3,4,5].sum
# los arrays pueden ser de cualquier tipo de dato.
multi_tipos = [4, 4.5, "hola", :symbol, []]
puts multi_tipos.map { |x| x.class }
# podemos dividir un string para crear un array con el metodo split
puts "hola mundo".split(" ")
puts "hola mundo".split(" ").size
puts "hola mundo".split(" ").map { |x| x.upcase }
# podemos ordenar numeros y letras o palabras en un array
puts ["z", "m", "a", "q", "d"].sort