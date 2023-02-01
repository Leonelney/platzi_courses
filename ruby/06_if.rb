# el if es indispensable para programar acorde a condiciones y su estructura no es
# complicada, a diferencia de otros lenguajes de alto nivel en ruby al finalizar
# un if debemos utilizar la palabra reservada "end"
is_authenticated = true

if is_authenticated
    # condición inicial
    puts "Esta autenticado"
else
    # condición final
    puts "No esta autenticado"
end

# otro ejemplo con elsif
role = :user

if role == :admin
    puts "Pantalla del admin"
elsif role == :superadmin
    # nueva condición
    puts "Pantalla del superadmin"
else
    puts "Pantalla de login"
end