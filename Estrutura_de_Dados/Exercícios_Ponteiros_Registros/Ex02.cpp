/* Na função main crie três variáveis inteiras chamadas Raiz, A e Num, e um ponteiro do tipo inteiro chamado Exp inicializado com NULL. 
Faça Exp receber o endereço de A. Pergunte ao usuário um número e armazene em Num, depois chame uma função chamada Contas passando a variável 
Raiz por referência, o ponteiro Exp e a variável Num por Valor. Esta função deve calcular a Raiz do valor armazenado em Num e armazenar em Raiz,
calcular o valor de Num elevado a 2 e armazenar no endereço apontado por Exp. Depois na função principal imprima o valor da variável Raiz e o 
valor apontado por Exp.

*/
#include <stdio.h>
#include <math.h>



void Contas(int *Raiz, int num, int *Exp){
	*Raiz = sqrt (num);
	*Exp = pow(num, 2);
		
};


int main (){
	
	int Raiz;
	int a;
	int num;
	int * Exp = NULL;
	
	
	Exp = &a;
	
	printf ("\n===CALCULOS DE POTENCIA E EXPONENCIACAO===\n");
	printf ("Insira um numero\n");
	scanf ("%d", &num);
	
	Contas (&Raiz, num, Exp);
	
	printf ("\nRaiz: %d\nExponenciacao: %d", Raiz, *Exp);
	
	return (0);	
}
