package org.generation.ejercicio8;


import java.util.Scanner;

public class ArrayPrimeNumbers {

	/*
	 Crear un programa en `Java` que realice lo siguiente:
	- Input
	  - Solicitar al usuario 10 números por consola y almacenarlos en un *array*
	- Colocar todos los números primos a las primeras posiciones, desplazando el resto al final de forma que ningún número se pierda.
	- Output
	  - Mostrar por consola el array que contiene los números primos al inicio, mostrando el índice seguido del valor de la posición.
	- El orden de los números **no importa** siempre y cuando los números primos se encuentren al inicio del array.
	
	--- 
	
	Input: 
	``` Java
	1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	```
	
	Output: Array mostrando la posicion del array y el valor correspondiente
	```Java
	pos[0] = 1
	pos[1] = 2
	pos[2] = 3
	pos[3] = 4
	pos[4] = 5
	pos[5] = 6
	pos[6] = 7
	pos[7] = 8
	pos[8] = 9
	pos[9] = 10
	
	// Array ordenado
	
	pos[0] = 2
	pos[1] = 3
	pos[2] = 5
	pos[3] = 7
	pos[4] = 1
	pos[5] = 4
	pos[6] = 6
	pos[7] = 8
	pos[8] = 9
	pos[9] = 10
	
	```
	
	## Consideraciones:
	
	- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
	- Hacer diferentes pruebas con numeros de input diferentes
	- Puedes desarrollar el algoritmo y su pseudocódigo
		 */
	public static void PrimeNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("En este programa introducirás 10 números. Estos se mostrarán 2 veces:");
		System.out.println("1. Tal cual como se introdujeron");
		System.out.println("2. Colocando al inicio los números primos");
		
		//Creamos Array
		int[] numbers = new int[10];
		
		//Pedimos los 10 numeros y guardamos en el array
		System.out.println("Introduzca 10 números");
	    for (int i = 0; i < 10; i++) {
	    	int number = scanner.nextInt();
	      numbers[i] = number;
	    }
		
	    //Imprimimos los números en orden, especificando su posición
	    System.out.println("Números en el orden en que fueron introducidos");
	    for (int i = 0; i < 10; i++) {
	        System.out.println("pos[" + i + "] = " + numbers[i]);
	      }
	    System.out.println();
	    
	    //Comprobar si son primos y colocarlos en nuevos arrays. Uno para primos y otro para no primos
	    int lenghtNumbers = numbers.length;
	    int primes = 0;
	    int noPrimes = 0;
	    int [] primeNumbers = new int [10];
	    int [] noPrimeNumbers = new int [10];
	    
	    for(int i = 0; i < lenghtNumbers; i++){
	        boolean isPrime = true;
	        
	        if(numbers[i] == 1) {
	        	isPrime = false;
	        }	        
		    for (int j = 2; j < i; j++){
	            if(numbers[i] % j == 0){
	                isPrime = false;
		        }
	        } if(isPrime) {
		        primeNumbers[primes] = numbers[i];
		        primes++;
	        } else {
		        noPrimeNumbers[noPrimes] = numbers[i];
		        noPrimes++;
	        }
	        
	    }
	    //Colocamos los primos al inicio del de numbers
	    for (int i = 0; i < primes; i++) {
	        numbers[i] = primeNumbers[i];
	      }
	    
	    //Colocmamos los que no son primos despues de los primos
	    for (int i = primes; i < primes + noPrimes; i++) {
	        numbers[i] = noPrimeNumbers[i - primes];
	      }
	    
	    //Mostramos el array nuevamente, ya acomodado
	    System.out.println("Números ordenados, primos primero");
	    for (int i = 0; i < 10; i++) {
	        System.out.println("pos[" + i + "] = " + numbers[i]);
	      }
	    scanner.close();
	    
		
	}
	
	public static void main(String[] args) {
		PrimeNumbers();

	}

}
