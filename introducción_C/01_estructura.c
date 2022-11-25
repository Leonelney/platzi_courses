/* para importar librerias a C usamos la palabra reservada "#include". */
#include <stdio.h>

/* la funcion principal de debe llamar main */
/* es importante mencionar que siempre hay que declarar que tipo de dato va a regresar 
   una funcion, en este caso es un int, por eso la funcion internamente retorna un 0.*/
int main(int argc, char const *argv[]){
    /* primer hola mundo usando la funcion printf para imprimir en consola.*/
    printf("Hello world");
    return 0;
}