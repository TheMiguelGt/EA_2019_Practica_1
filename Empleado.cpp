#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>


struct Empleado {
   char nombre[100];
   char numeroDeEmpleado[100];
   unsigned int edad[50];
   char numeroDeSeguro[14];
};


int main(){
	struct Empleado empleados[1];
	printf("Ingese el nombre");
	scanf("%99[^\n]",empleados[0].nombre);
	printf("Ingrese edad");
	scanf("%d",&empleados[0].edad);
	printf("Ingrese el numero de empleados");
	scanf("%s",empleados[0].numeroDeEmpleado);
	printf("Ingrese el numero de seguro");
	scanf("%s",empleados[0].numeroDeSeguro);
	printf("%s %d %s %s",empleados[0].nombre, empleados[0].edad, empleados[0].numeroDeEmpleado, empleados[0].numeroDeSeguro);
	
	FILE*filepointer;
	filepointer=fopen("empleados.txt", "r+");
	fprintf(filepointer, "%s %d %s %s\n",empleados[0].nombre, empleados[0].edad, empleados[0].numeroDeEmpleado, empleados[0].numeroDeSeguro );
	fclose(filepointer);
	
}
