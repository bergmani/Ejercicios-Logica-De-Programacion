package org.generation.ejercicio6;

import java.util.Scanner;

public class InvertString {
	
	/*
	 Crear un programa en `Java` que realice lo siguiente:

	- Input
	  - Solicitar por consola una palabra o frase
	
	- Output
	  - Mostrar por consola el texto ingresado de forma invertida.
	
	--- 
	
	Input:
	```
	Hola Generation
	```
	Output:
	``` 
	noitareneG aloH
	```
	
	## Consideraciones
	
	- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`.
	- Puedes desarrollar el algoritmo y su pseudocódigo
	 */
	public static String invert(String text) {
	
		//Variable para guardar texto invertido
		String invertedText ="";
		//Se invierte el texto
		for(int i = text.length()-1; i>=0 ; i--) {
			invertedText = invertedText + text.charAt(i);
		} return invertedText;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase y la invertiremos");
		String text = scanner.nextLine();
	
	    System.out.print(invert(text));
		 
		scanner.close();
	}
}
