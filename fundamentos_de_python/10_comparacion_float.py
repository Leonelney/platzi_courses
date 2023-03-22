x = 3.3
y = 1.1 + 2.2
print(x)
print(y)
# si comparamos las dos variables nos regresará False por que tienen precisiones diferentes.
print(x == y)
# hay varias formas para recortar la precisión de los números float.
# el primero es por medio de castear el float a string y manipularlo.
# para eso podemos usar la función format().
y_str = format(y, ".2g")
print("str ->", y_str)
# ahora debemos volver a castear, ya sea el float a str o el str a float.
print(y_str == str(x))
print(float(y_str) == x)

# para resolver el mismo caso pero de manera matemática, podemos crear un valor de tolerancia
# para que comparemos los números y veamos si son iguales o no.
tolerancia = 0.00001
# abs() es una función que regresa el valor absoluto de un número, es decir, lo convierte a positivo
# si es negativo.
print(abs(x - y) < tolerancia)
