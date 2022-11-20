# cuando sumamos 2 strings estos se concatenan y cuando sumamos 2 números estos se suman 
# normalmente.
print("leonel" + " olivares")
print(10 + 20)
# pero si nosotros tratamos de sumar un string con un número esto nos creará un error.
#   print("leonel" + 24) -> ERROR
# para resolver esto podemos usar la función str() para castear un valor a un string.
name = "leonel"
age = 12
print("Mi edad es " + str(age))
# de forma inversa cuando usamos input() siempre obtenemos un string, por lo que la 
# función int() nos ayuda a convertir números string a integers.
age = input("¿Cuál es tu edad?")
print(type(age))
age = int(age)
print(type(age))
age += 10
print(f"Tu edad en 10 años erá {age}")
# pero nosotros no podemos convertir un string que contenga letras a número.
# int("leonel") -> ERROR