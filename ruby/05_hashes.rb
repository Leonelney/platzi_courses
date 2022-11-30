# ahora tenemos los hashes o diccionarios que se definen con {}
capitales = {}
puts capitales.class
# definir el contenido de un hash
capitales = {"Colombia" => "Bogota"}
capitales["Mexico"] = "Ciudad de Mexico"
capitales["Peru"] = "Lima"
capitales["España"] = "Madrid"
puts capitales
# podemos acceder a un valor usando los corchetes []
puts capitales["Mexico"]
puts capitales["España"]
# tambien tenemos size para saber su tamaño
puts capitales.size
# esta vacio??
puts capitales.empty?
hash_vacio = {}
puts hash_vacio.empty?
# puedes preguntar si hay algun valor o llave en especifico
puts capitales.has_value? "Madrid"
puts capitales.has_key? "Peru"
puts capitales.has_value? "Buenos Aires"
puts capitales.has_key? "Paises Bajos"
# podemos invertir los valores con las llaves
puts capitales.invert
# unimos dos hash con el metodo merge
puts capitales.merge({"Paris" => "Francia"})
# podemos transformar todos los values como si usaramos el metodo map de los array
# pero usamos el metodo transform_values
puts capitales.transform_values { |x| x.downcase }
# pero igual podemos usar map para crear un array usando un hash
puts capitales.map {|k,v| "La capital de #{k} es #{v}"}
# podemos crear un hash a partir de un array de parejas
puts [["Leonel", 24], ["Cecilia", 16]].to_h