#include <stdio.h>

/* Se puede declarar variables fuera de las funciones.*/
int i, j, k;
/* puedes crear varibales que se usaran en diferentes archivos al ejecutar una 
   aplicación con multiples archivos. */
extern int variableExterna;

/* declaración de variables */
int a, b, c;
float f, g, h;

int main(int argc, char const *argv[])
{
    /* inicialización de variables*/
    a = 1;
    b = 34;

    c = a + b;
    printf("Value of sum is: %d\n", c);
    /* caso de overflow o desbordamiento.*/
    /* recuerda que el número máximo que puede almacenar un int es de 2,147,483,647.*/
    /* si se pasa habra un desbordamiento y empezará el número en la parte negativa.*/
    b = 2147483647;
    c = a + b;
    printf("Value of sum is: %d\n", c);
    /* para usar una varaible externa tienes que iniciarla de nuevo.*/
    int variableExterna = 3;
    printf("%d", variableExterna);
    return 0;
}
