# si un if recibe un True lo que se encuentra dentro se debe ejecutar.
if True:
    print("estoy dentro de una condición que se cumplió.")
# si un if recibe un False lo que se encuentra dentro no se debe ejecutar.
if False:
    print("esto no se debe ejecutar por nada del mundo")
# veamos una aplicación
pet = input("cual es tu mascota favorita?: ")
if pet == 'perro':
    print("amo a los perros.")
if pet == 'gato':
    print("los mininos duermen mucho.")
# que pasa si no seleccionamos un caso que no es tomada en cuenta, como si hubiéramos 
# escrito pez, pues nada, no se ejecuta nada. Entonces para eso existe el else, el cual 
# ejecuta un código si es que no se cumple ninguna condición.
stock = int(input("introduce el número de stock?: "))
if stock >= 100 and stock <= 1000:
    print("el stock esta dentro del rango.")
else:
    print("el stock esta fuera del rango.")
# por último podemos combinar varias condiciones en cascada con elif y combinarlo con else.
pet = input("cual es tu mascota favorita?: ")
if pet == 'perro':
    print("amo a los perros.")
elif pet == 'gato':
    print("los mininos duermen mucho.")
elif pet == 'pez':
    print("solo nadan y nadan.")
else:
    print("animal no reconocido.")
# es muy importante hacer nuestro programas con elif por que si usamos puro if, como en 
# el primer caso, se van evaluar todas las condiciones y eso puede consumir tiempo 
# computacional y con el elif una vez que se cumpla una condición ya no evalúa las restantes.