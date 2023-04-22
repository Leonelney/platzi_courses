set_countries = {'col', 'mex', 'bol'}

# obtener el tamaño del set
print(len(set_countries))

# un elemento esta dentro de un set?
print('mex' in set_countries)
print('arg' in set_countries)

# podemos agregar un elemento al set
set_countries.add('pe')
set_countries.add('pe')
print(set_countries)

# podemos actualizar un set como si se sumarán dos sets
set_countries.update({'ar', 'ecua', 'pe'})
print(set_countries)

# podemos remover elementos del set
set_countries.remove('col')
print(set_countries)

# si se remove un elemento que noe sta dentro del set saltará un error
# podemos usar discard() para que en caso de no existir dentro del set, no pase nada.
set_countries.discard('arg')
set_countries.discard('bra')
set_countries.discard('ar')
print(set_countries)

# podemos eliminar por completo un set 
set_countries.clear()
print(set_countries)
print(len(set_countries))

