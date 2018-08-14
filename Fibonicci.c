#include<stdio.h>
#define N 87
int main(){
printf("FIBONACCI NUMBERS: \n");
int fib[N],i = 0,j=0;
fib[0] = 0;
fib[1] = 1;
for (i = 2; i < N; i++){
fib[i] = fib[i-1] + fib[i-2];
}
printf("Your fibonicci series: \n");
for (j = 0; j < N; j++){
printf("%d\n",fib[j]);

}

}
