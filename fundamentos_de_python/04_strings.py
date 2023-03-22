# podemos tener dos variables con un tipo de dato string.
name = 'Leonel'
last_name = 'Olivares'
print(name)
print(last_name)
# algo interesante es que podemos unir dos string para crear uno solo, a esto se le
# conoce como concatenación y se realiza con el operador de suma ("+").
full_name = name + last_name
print(full_name)
# salio junto el nombre y el apellido, mmmm, hay que poner un espacio ahí en medio.
full_name = name + " " + last_name
print(full_name)

# cuando usamos apostrofes o necesitamos utilizar comillas simples dentro de un string
# como algo propio del texto entonces debemos usar su contra parte, las comillas dobles,
# para crear el string, así también de manera inversa al querer usar las comillas dobles
# dentro del texto.
print("I'm Leonel")
print('This is "important"')

# el formato es demasiado util para crear estructuras que funcionarán como plantillas
# donde ciertas partes del texto son dinámicas.
plantilla = "Hola, mi nombre es {} y mi apellido es {}.".format(name, last_name)
print(plantilla)
# otra forma de hacer lo mismo es con la sintaxis f""
# es casi igual solo que el nombre de las variables va dentro de las llaves y no como
# argumentos de la función format().
plantilla = f"Hola, mi nombre es {name} y mi apellido es {last_name}."
print(plantilla)