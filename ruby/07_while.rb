# el while es un poco más interesante ya que acompañado de su condición se usa la 
# palabra do para ejecutarlo el código interno.
idx = 1
while idx < 5 do
    puts "Estoy usando un ciclo while, idx es igual a #{idx}"
    idx += 1
end

# también tenemos el clásico for que a diferencia de python el rango lo inicializamos
# usando dos puntos entre el inicio y el final del rango.
for idx in 1..4 do
    puts "Estoy usando un ciclo for, idx es igual a #{idx}"
end

# pero dentro de los ciclos no solamente tenemos el while, para ruby tenemos el
# loop, el cual es un ciclo infinito y dentro de el debemos declarar la condición
# de salida del ciclo
idx = 1
loop do
    puts "Estoy usando un ciclo loop, idx es igual a #{idx}"
    idx += 1
    break if idx >= 5
end

# los array tienen un método que permite iterar sobre su contenido este es el metodo "each".
[1,2,3,4].each { |idx| puts "Estoy usando el método each de un array, idx es igual a #{idx}"}

# Pero los ints tiene también un método para iterar tantas veces sea el número, usando "times".
# Este empieza en 0
4.times {|idx| puts "Estoy usando el método times de un int, idx es igual a #{idx}"}