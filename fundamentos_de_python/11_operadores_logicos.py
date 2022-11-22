# AND
# el primer operador lógico es el "and", esto no es muy complicado, pertenece a la algebra
# booleana y este operador regresa un True solo si los dos valores booleanos son True,
# de lo contraría regresará un False.
print("AND")
print("False and False =>", False and False)
print("False and True \t=>", False and True)
print("True and False \t=>", True and False)
print("True and True \t=>", True and True)
# si recuerdas al comparar número esto nos regresa un valor booleano, por lo que pueden
# ser usados para realizar operaciones lógicas.
print(10 > 5 and 5 < 10)
print(10 > 5 and 5 > 10)

# OR
# el segundo operador lógico es el "or", este operador regresa True siempre y cuando que
# ninguno de los dos valores booleanos sea False.
print("OR")
print("False or False \t=>", False or False)
print("False or True \t=>", False or True)
print("True or False \t=>", True or False)
print("True or True \t=>", True or True)
# imagina que el True es igual a 1 y False es igual a 0, and actua como una multiplicación,
# solo da True cuando multiplicas 1 * 1 por que eso regresa uno y cuando se multiplica por 
# 0 siempre dará 0. Para el or puedes imaginarlo como una suma, solo si sumas 0 + 0 siempre
# te dará 0, o sea False. 