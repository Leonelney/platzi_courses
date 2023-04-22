# las operaciones entre conjuntos es la misma teoría de conjuntos que se conoce.
# se puede realizar uniones, intersecciones, diferencias y diferencias simétricas entre dos conjuntos.
set_a = {'col', 'mex', 'bol'}
set_b = {'pe', 'bol'}

# union de sets
# primero método
set_c = set_a.union(set_b)
print(set_c)
# segundo método
print(set_a | set_b)

# intersección de sets
# primer método
set_c = set_a.intersection(set_b)
print(set_c)
# segundo método
print(set_a & set_b)

# diferencia de sets
# primer método
set_c = set_a.difference(set_b)
print(set_c)
set_c = set_b.difference(set_a)
print(set_c)
# segundo método
print(set_a - set_b)
print(set_b - set_a)

# diferencia simétrica de sets
# primer método
set_c = set_a.symmetric_difference(set_b)
print(set_c)
# segundo método
print(set_a ^ set_b)
