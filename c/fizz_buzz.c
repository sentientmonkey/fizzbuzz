#include <stdio.h>
#include <string.h>

#define MAX_BUFF 10

const char* fizz(int i) {
    if((i % 3) == 0) {
        return "Fizz";
    }
    else {
        return "";
    }
}

const char* buzz(int i){
    if((i % 5) == 0) {
        return "Buzz";
    }
    else {
        return "";
    }
}

void itoa(int i, char* a){
    snprintf(a, sizeof(a), "%i", i);
}

int main(){
    char result[MAX_BUFF];
    char number[MAX_BUFF];
    int i;
    for(i=1; i < 100; i++){
        strncpy(result, "", sizeof(result));
        strlcat(result,fizz(i),sizeof(result));
        strlcat(result,buzz(i),sizeof(result));
        if(strnlen(result,sizeof(result)) < 1) {
            itoa(i,number);
            strlcat(result,number,sizeof(result));
        }
        printf("%s\n", result);
    }
    return 0;
}
