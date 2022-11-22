# la negación de un True
print(not True)
# la negación de un False
print(not False)
# esto es sencillo, pero realmente esto se puede aplicar a toda una operación
print("NOT AND")
print("not (False and False) \t=>", not (False and False))
print("not (False and True) \t=>", not (False and True))
print("not (True and False) \t=>", not (True and False))
print("not (True and True) \t=>", not (True and True))
# podemos verificar si un número esta dentro o no de un límite con una misma condición,
# solo debemos negarla.
stock = 50
print(not(stock >= 100 and stock <= 1000))
print(stock >= 100 and stock <= 1000)