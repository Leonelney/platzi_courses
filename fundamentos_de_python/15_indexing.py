# los strings tiene indicadores y esots nos permiten acceder a los strings a nivel de posiciones
text = "Ella baila sola"
print("El texto de prueba es:", text)
print("-"*40)

# acceder a posiciones especificas
# el conteo de posiciones empieza en el 0
print("El primer caracter del texto es:", text[0])
print("El segundo caracter del texto es:", text[1])

# si nosotros tratamos de acceder a una posición que no existe nos marcará un error
# si qeremos imprimir el último caracter de un string podemos utilizar la función len para conocer el tamaño del string
size = len(text)
# recuerda que el conteo empieza en 0 para identificar el posicionamiento de un string por lo que debemos restarle 1 al tamaño para obtener la última posición
print("El último caracter del texto es:", text[size-1])
# una forma más sencilla de obtener el mismo resultado es con los indicadores negativos, estos nos permitiran recorrer el string hacia atras.
print("El último caracter del texto es:", text[-1])

# normalmente no solo ocuparemos un caracter de un string, buscaremos extraer una substring y esto se logra con las slicing
# la sintaxis es 'inicio':'final':'pasos'
# los pasos son opcionales y por default se hace el recorrido de 1 por 1
print("1.", text[:4])
print("2.", text[5:10])
print("3.", text[5:-5])
print("4.", text[5:])
print("5.", text[:])
print("6.", text[:15:1])
print("7.", text[::2])
print("8.", text[:15:2])
print("9.", text[::3])
print("10.", text[:15:3])
# una abreviatura en Python es que cuando el inicio o final sea 0 este no se escribe