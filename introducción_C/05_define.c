#include <stdio.h>

/* define se usa para definir constantes también que const, pero se usa para definir 
todos los valores arriba del código.*/
#define PIZZACOST 1.5
const char NEWLINE = '\n';

int main(int argc, char const *argv[])
{
    float costoPizzas;
    float numberOfSlices = 3;
    costoPizzas = PIZZACOST * numberOfSlices;

    printf("Total bill: %f", costoPizzas);
    printf("%c", NEWLINE);
    return 0;
}
