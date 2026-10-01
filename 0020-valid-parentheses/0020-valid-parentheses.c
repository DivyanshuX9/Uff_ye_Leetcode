typedef struct stack{
    char ar[100000];
    int top;
}stack;

void push(char a,int *top,char ar[]){
    ar[++(*top)]=a;
}
int val(char s){
    switch(s){
        case '{':return 1;
        case '(':return 2;
        case '[':return 3;
        case ']':return -3;
        case ')':return -2;
        case '}':return -1;    
    }
    return 0;
}
bool pop(char a, int *top, char ar[]) {
    if (*top < 0) return false;
    if (val(ar[*top]) + val(a) == 0) {
        (*top)--;
        return true;
    }
    return false;
}

bool isValid(char* s) {
    struct stack* st=(struct stack*)malloc(sizeof(stack));
    st->top=-1;
     for (int a = 0; a < strlen(s); a++) {
        if (s[a] == '(' || s[a] == '[' || s[a] == '{') {
            push(s[a], &(st->top), st->ar);
        } else if (s[a] == ')' || s[a] == ']' || s[a] == '}') {
            if (!pop(s[a], &(st->top), st->ar)) {
                free(st);
                return false;
            }
        } else {
            free(st);
            return false;  
        }
    }
    bool result = (st->top == -1);
    free(st);
    return result;
}