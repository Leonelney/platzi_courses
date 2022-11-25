#include <stdio.h>

/* tipo de dato void */
void funcion(){
    return;
}

/* tipo de dato enum */
enum weekDays {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
};

enum deck {
    club = 0,
    diamonds = 5,
    hearts = 10,
    spades = 15
} card;

int main(int argc, char const *argv[]){
    /* aritmeticos enteros */
    short numberShort;
    unsigned short numberShortUS;
    int numberInt;
    unsigned numberIntUS;
    long numberLong;
    unsigned long nummberLongUS;
    /* aritmeticos flotantes */
    float numberFloat;
    double numberDouble;
    long double numberLongDouble;
    /* tipo de datos enum */
    enum weekDays today;
    today = Wednesday;
    printf("Day %d", today+1);
    printf("\n");
    today = Sunday;
    printf("Day %d", today+1);
    printf("\n");
    card = spades;
    printf("card power %d", card);
    printf("\n");
    printf("Size of var %ld", sizeof(card));
    /* tipo de dato char */
    char caracter;

    return 0;
}
