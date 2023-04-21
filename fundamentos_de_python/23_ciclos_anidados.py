matriz = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

# podemos hacer ciclos anidados para explorar estructuras de datos que tengan dentro más estructuras de datos.
for row in matriz:
    print(row)
    for column in row:
        print(column)