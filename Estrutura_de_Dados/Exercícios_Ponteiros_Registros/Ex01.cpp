//Esdras Jose da Silva Costa

#include <stdio.h>
#include <stdlib.h>

struct ClientRecord{
	char name[50];
	char street[50];
	int numb;
	char city[30];
	char state[30];
	char ZipCode[9];

}client;

int main(){
	
	struct ClientRecord client;
	
	printf ("\t\t\t\t=========================\n");
	printf ("\t\t\t\t\tCLIENT RECORD\n");
	printf ("\t\t\t\t=========================\n");


	printf ("Name?\nR: " );
	scanf ("%s", &client.name );
	printf ("Street?\nR: " );
	scanf ("%s", &client.street );
	printf ("Numb?\nR: ");
	scanf ("%d", &client.numb);
	printf ("City?\nR: " );
	scanf ("%s", &client.city);
	printf ("State?\nR: " );
	scanf ("%s", &client.state );
	printf ("Zip Code?\nR: " );
	scanf ("%s", &client.ZipCode);
	
	printf ("\n\n%s\n", client.name);
	printf ("%s", client.street);
	printf (" %d\n", client.numb);
	printf ("%s", client.city);
	printf (" - %s", client.state);
	printf ("\n%s", client.ZipCode);

	
	return 0;		
}

