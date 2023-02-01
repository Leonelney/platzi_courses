# para poder crear una expresión regular en ruby utilizamos el slash "/" seguido de 
# la expresión regular
is_gmail_regex = /\w+@gmail.com/

# para validar si un string cumple con un regex usamos el método match
puts "leonel@gmail.com".match is_gmail_regex
# este nos regresa todos las coincidencias que se encontraron

# de no encontrar nnguna regresara un null
puts "leonel@gmail.mx".match is_gmail_regex