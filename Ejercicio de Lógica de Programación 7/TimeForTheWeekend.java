package org.generation.ejercicio7;

import java.util.Scanner;

public class TimeForTheWeekend {
	
	/*
	 Crear un programa en `Java` que realice lo siguiente:
	- Input
	  - Solicitar al usuario un dia de la semana (Lunes - Viernes)
	  - Solicitar al usuario una hora (horas y minutos)
	- Calcular cuántos minutos faltan para el fin de semana.
	  - Considerando el inicio para el fin de semana **Viernes a las 15:00 hrs**
	- Output
	  - Mostrar el resultado por un mensaje en consola.
	
	--- 
	
	Input: Lunes, 14:30 hrs
	``` Java
	lunes
	14
	30
	```
	
	Output:
	```Java
	"Faltan 5790 minutos para el fin de semana"
	```
	
	## Observaciones adicionales:
	
	- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
	- El programa debe verificar que los datos de entreada sean válidos para continuar su función.
	- En caso de que no lo sean, detener el programa y volver a solicitar los datos.
	 */
	
	public static void minutesLeft() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Quieres saber cuántos minutos faltan para el fin de semana?");
		System.out.println("Introduce un día de Lunes - Viernes");
		String day = scanner.nextLine().toLowerCase();
		
		System.out.println("Introduce una hora en formato de 24 horas, sin minutos");
		int hour = scanner.nextInt();
		
		System.out.println("Intruce los minutos");
		int minutes = scanner.nextInt();
		
		
		//Saber cuantos dias faltan para el viernes
		int days = 0;
		switch(day) {
			case "lunes":
				days = 4;
				break;
			case "martes":
				days = 3;
				break;
			case "miércoles":
				days = 2;
				break;
			case "jueves":
				days = 1;
				break;
			case "viernes":
				days = 0;
				break;
		}
		
		//Guardamos en una variable los dias en restantes a minutos
		int daysInMinutes = days * (24*60);
		
		//Pasar horas a minutos y sumarlos para saber los minutos transcurridos del día.
		int minutesDay = minutes + (hour*60);
		
		//Creamos variable para guardar los minutos que quedan del dia para las 15hrs(900 minutos)
		int minutesLeftDay = 900 - minutesDay;
		
		//Sumamos los minutos de los dias y los minutos que quedan para las 15 y guardamos en variable
		int minutesForWeekend = daysInMinutes + minutesLeftDay;
		
		//Mostramos la ultima variable en consola
		System.out.println("Faltan " + minutesForWeekend + " minutos para el fin de semana (Viernes a las 15:00 hrs)");

		
		scanner.close();
	}
	public static void main(String[] args) {
		minutesLeft();
		
	}

}
