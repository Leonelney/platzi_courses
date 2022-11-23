# un string se declara con comillas simples, comillas dobles o
# con una notación especial que es %q(Texto)
saludo_1 = 'Hola'
saludo_2 = "Hola"
saludo_3 = %q(Hola)
# podemos crear plantillas.
saludo_plantilla = "#{saludo_1} Mundo"
puts saludo_plantilla
# tambien funciona con %Q()
saludo_plantilla = %Q(#{saludo_1} Mundo)
puts saludo_plantilla
# hay que tener cuidado por que no funciona la interpolación de
# variables con comillas simples.
# saludo_plantilla = '#{saludo_1} Mundo' -> ERROR

# veamos algunos metodos de los strings...
puts "leonel".class
puts "leonel".upcase
puts "LEONEL".downcase
puts "leonel".length
puts "Leonel".swapcase
puts "leonel".include? "g"
puts "   leonel   ".strip
puts "".empty?
puts "leonel".gsub("leo","Ema")
puts "leonel leonel".gsub("leo","Ema") # todas las concurrencias

# también podemos hacer operaciones conocidas con los strings.
puts "leonel" + " olivares" # concatenación
puts "leonel" * 3           # multiplicación de strings
puts "leonel"[2]            # indices

# cuando usamos un metodo este hace una copia del valor sin afectar la variable original,
# pero podemos hacer que directamente guarde el resultado en la misma variable usando la
# terminación "!".
variable = "leonel"
variable.gsub("leo", "Ema") # esto se debe guardar en otra variable para conservar el resultado
puts variable
variable.gsub!("leo", "Ema")
puts variable