#include <stdio.h>
#include <string.h>

#define MAX_BUFF 10
#define NUMBER_FUNCTIONS 2

const char* fizz(int i) {
    if((i % 3) == 0) {
        return "Fizz";
    }
    else {
        return "";
    }
}

const char* buzz(int i) {
    if((i % 5) == 0) {
        return "Buzz";
    }
    else {
        return "";
    }
}

const char* (*dispatch[NUMBER_FUNCTIONS])(int i) = {fizz,buzz};

void itoa(int i, char* a) {
    snprintf(a, sizeof(a), "%i", i);
}

void clear(char* s) {
    strncpy(s, "", sizeof(s));
}

void run_functions(int i, char* result) {
    int f;
    for(f=0; f < NUMBER_FUNCTIONS; f++) {
        strlcat(result,(*dispatch[f])(i),sizeof(result));
    }
}

void add_number(int i, char* result) {
    char number[MAX_BUFF];
    if(strnlen(result,sizeof(result)) < 1) {
        itoa(i,number);
        strlcat(result,number,sizeof(result));
    }
}

int main(){
    char result[MAX_BUFF];
    int i;
    for(i=1; i < 100; i++) {
        clear(result);
        run_functions(i, result);
        add_number(i, result);
        printf("%s\n", result);
    }
    return 0;
}
