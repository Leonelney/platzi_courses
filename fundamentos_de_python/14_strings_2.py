# los strings tienen muchos métodos que nos permiten manipularlos de diferentes maneras
text = "Este es un texto cualquiera. Simplemente educativo."
print(f"El texto de prueba es el siguiente '{text}'")
print("-" * 40)

# validar si una subcadena esta dentro de un string
print("Estará la palabra 'animal' dentro del texto?", 'animal' in text)
print("Estará la palabra 'Simple' dentro del texto?", 'Simple' in text)

# obtener el número de carácteres de un string
print(f"El texto tiene un total de {len(text)} caracteres")

# convertir todos los caracteres a mayúsculas
print("Este es el texto en mayúsculas:", text.upper())

# convertir todos los caracteres a minúsculas
print("Este es el texto en minúsculas:", text.lower())

# contar caracteres especificos en un string
print("Cuantas letras 'a' hay en el texto?:", text.count("a"))

# convertir los caracteres en mínusculas a mayúsculas y viceversa
print("Este es el texto invertido:", text.swapcase())

# preguntar si un string comienza con una subcadena
# sensible a minúsculas y mayúsculas
print("El texto comienza con 'Este':", text.startswith("Este"))

# preguntar si un string termina con una subcadena
# sensible a minúsculas y mayúsculas
print("El texto termina con 'informativo':", text.endswith("informativo"))

# remplazar una subcadena por otra dentro de un string
print("Este es el texto cambiando la palabra educativo por informativo:", text.replace("educativo", "informativo"))

print("-" * 40)
text_2 = "aprendiendo a usar python"
print("El segundo texto de prueba es el siguiente:", text_2)
print("-" * 40)

# poner la primera palabra de nuestro texto en mayúscula
print("Este es el segundo texto con letra capital:", text_2.capitalize())

# poner la primera letra de cada palabra en mayúscula
print("Este es el segundo texto con letra capital en cada palabra:", text_2.title())

# preguntar si un string es un número
print("12 es un número:", "12".isdigit())
print("'Hola' es un número:", "Hola".isdigit())