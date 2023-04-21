# como en otros lenguajes de programación el for nos permite hacer iteraciones dando un 
# limite de iteraciones, solo que en Python se puede explotar un poco más su uso

# utilizamos range() para crear una lista de números que nos permitirá definir las iteraciones
for element in range(20): # toma en cuenta el 0, por lo que la lista se crea de 0 a 19, el 20 no se incluye
    print(element)

# podemos ajustar un poco el range()
for element in range(5,10): # inicie no solo desde 0
    print(element)
for element in range(0,20,2):   # de saltos de 2 en 2
    print(element)

# no solo podemos usar números para iterar, también podemos iterar sobre una lista, 
# tupla o diccionario
my_list = [23, 45, 67, 89, 43]
for element in my_list:
    print(element)

my_tuple = ['Hola', 'mundo', 'aquí', 'estoy']
for element in my_tuple:
    print(element)

product = {
    'name': 'Camisa',
    'price': 100,
    'stock': 89
}
for key in product:
    print(key, "=>", product[key])
for key, value in product.items():
    print(key, "=>", value)