name = "simon"
name_2 = "simon"
# el metodo object_id nos regresa un identificador de la variable que es único.
puts name.object_id
puts name_2.object_id
# los symbols nos permiten crear multiples variables que contengan el mismo valor, pero
# sin replicar el valor en si y sobre cargar la memoria.
# en el primer caso las variables de name tenían el mismo valor, pero ocupaban dos espacios
# diferentes de memoria, con los symbols evitamos eso.
color = :rojo
color_2 = :rojo
puts color.object_id
puts color_2.object_id
# un symbol tambien tiene metodos...
puts :rojo.class
puts :rojo.to_s