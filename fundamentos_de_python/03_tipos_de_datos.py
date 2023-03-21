# el primer tipo de dato es el string, es simplemente texto y puede crearse a partir de
# comillas simples o comillas dobles.
my_name = 'Leonel'
print('my_name =>', my_name)
# antes de continuar usaremos la función type() la cual nos regresa el tipo de dato que 
# almacena nuestra variable. En este caso nos regresa 'str' el cual hace referencia al
# tipo de dato string.
print(type(my_name))
# el siguiente tipo de datos es el integer o int, los cuales son números enteros.
my_age = 24
print("my_age =>", my_age)
print(type(my_age))
# el siguiente tipo de dato son los booleanos, estos se caracterizan por solo tener 2
# valores True o False. Son muy utiles para las condiciones.
is_single = True
print("is_single =>", is_single)
print(type(is_single))
is_single = False
print("is_single =>", is_single)
print(type(is_single))
# qué pasa cuando solicitamos datos numericos utilizando input()??
# lo que regresa siempre será un string aunque se haya pasado un número.
my_age = input('¿Cuál es tu edad?: ')
print('my_age =>', my_age)
print(type(my_age))