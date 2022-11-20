# la creación de las variables es muy sencilla, solo necesitas
# escribir el nombre de la variables, seguido de un signo igual
# que es mejor conocido como signo de asignación y después colocar
# el dato que almacenará nuestra variable.
#   <nombre_varibale> = <dato>
my_name =  "Leonel"
# con una variable podemos hacer lo que sea para manipularla, pero
# lo primero que haremos es imprimir nuestra variable.
print(my_name)
# no solo puedes guardar texto, puedes guardar lo que sea.
my_age = 24
print(my_age)
# lo que se almacena en una variable puede cambiar, no es inmutable.
# utilizaremos la misma sintaxis de crear una variable para cambiar
# su valor.
my_name = "Santiago"
# podemos pasar varios argumentos delimitados por una coma para
# poder crear un mensaje más detallado de la impresión y usando
# variables.
print("El nuevo nombre es", my_name)
# volveremos a cambiar el valor de la varibale my_name, pero esta
# vez vamos a recibir información del usuario, es decir vamos a
# recibir un nombre del usuarios a través de la terminal y lo
# guardaremos en la variable my_name.
# Para esto utilizaremos la fucnión input() la cual permite la 
# introducción de texto del usuario al programa.
# puede llevar un argumento de texto la función input() para imprimirlo
# como indicaciones de lo que el usuario debería introducir. 
my_name = input("¿Cuál es tu nombre?: ")
print("Usando input cambie el nombre a", my_name)
# tambien hay que cambiar la edad, no?
my_age = input("¿Cuál es tu edad?: ")
print("Usando input cambie la edad a", my_age)