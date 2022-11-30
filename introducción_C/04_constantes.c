#include <stdio.h>

/* una constante se define igual que una variable, pero se usa la palabra reservada
   const antes de la declaración.*/
/* Es importante mencionar que una constante es de solo lectura, eso quiere decir que 
   una vez que sea definida, no se podrá modificar su contenido.*/
const int number = 3;

int main(int argc, char const *argv[])
{
    printf("The number constant is: %d", number);
    return 0;
}
