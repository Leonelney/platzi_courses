# con los números podemos intepretar diferentes tipos de datos como lo son la edad,
# dinero, etc.
# cuando declaras un número, este no puede ir entre comillas, por que esto crearía un
# string en vez de un número.
lives = "3"     # vidas en un videojuego
print(type(lives))
lives = 3
print(type(lives))
# también no soloe xisten los números enteros (int) sino que existen los números
# flotantes (float) los cuales interpretan a los números con punto decimal.
temperatura = 12.25
print(type(temperatura))

# el resultado de una operación también puede guardarse directamente en una variable
lives = 3 + 1
print(lives)
# normalmente se utiliza el valor almacenado en una variable para actualizar el valor,
# así que al asignar un nuevo valor a una variable esta se puede autoreferenciar.
lives = lives + 2
print(lives)
# hay una forma abreviada de hacer esta operación, esto indica que se va a utilizar el 
# mismo valor de la variable y se le va a hacer una opreación y se almacenará en la misma
# variable.
lives += 2  #suma
print(lives)
lives -= 2  #resta
print(lives)
lives *= 2  #multiplicación
print(lives)
lives /= 2  #división
print(lives)
lives **= 2  #exponenciación
print(lives)
lives %= 2  #residuo
print(lives)

# los flotantes pueden ser muy grandes o contener muchos decimales, lo que hace Python es escribir
# dichos números en forma cientifica.
number = 450000000000000000000000000.1
print(number)
number = 0.000000000000000000000000001
print(number)