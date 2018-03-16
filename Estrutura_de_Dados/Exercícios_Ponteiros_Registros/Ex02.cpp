/* Na fun��o main crie tr�s vari�veis inteiras chamadas Raiz, A e Num, e um ponteiro do tipo inteiro chamado Exp inicializado com NULL. 
Fa�a Exp receber o endere�o de A. Pergunte ao usu�rio um n�mero e armazene em Num, depois chame uma fun��o chamada Contas passando a vari�vel 
Raiz por refer�ncia, o ponteiro Exp e a vari�vel Num por Valor. Esta fun��o deve calcular a Raiz do valor armazenado em Num e armazenar em Raiz,
calcular o valor de Num elevado a 2 e armazenar no endere�o apontado por Exp. Depois na fun��o principal imprima o valor da vari�vel Raiz e o 
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
