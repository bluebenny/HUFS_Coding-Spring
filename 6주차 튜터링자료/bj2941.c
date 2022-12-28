#include <stdio.h>

int countStrLen(char* s) {
    int input_len = 0;

    while (1) {
        if (s[input_len] == '\0')
            break;
        else
            input_len++;
    }

    return input_len;
}

int main(void) {

    char s[500];
    int count = 0;

    gets(s);
    int input_len = countStrLen(s);

    for (int i = 0; i < input_len; i++) {

        if (s[i] == '=' || s[i] == '-') {
            count++;
            if (s[i - 1] == 'z' && s[i - 2] == 'd')
                count++;

            continue;
        }
        
        if (s[i] == 'j' && (s[i - 1] == 'l' || s[i - 1] == 'n'))
            count++;
    }

    printf("%d\n", input_len - count);

    return 0;
}
