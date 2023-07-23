package org.generation.ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class EngSpaDictionary {
	
	/*
	 Crear un programa en `Java` que realice lo siguiente
	- Crear un diccionario Español-Inglés, que contenga al menos *20* palabras con su respectiva traducción
	- Utiliza un *objeto* `HashMap` para almacenar pares de palabras
	- Input 
	  - Solicitar a usuario una palbra en español
	- Output
	  - Mostrar por consola la palabra en inglés
	  - En caso de no encontrar su traducción en el diccionario, debe imprimir un mensaje indicándolo
	
	---
	
	Input:
	```Java
	"gato"
	```
	
	Output:
	```Java
	"cat"
	```
	
	Output alternativo:
	```Java
	"La palabra no se encuentra en el diccionario"
	```
	
	## Consideraciones
	
	- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
	- Prueba con diferentes input validos y no validos
	- Se puede agregar validación de input
	-  Puedes desarrollar el algoritmo y su pseudocódigo
	 */
	
	//HashMap con el diccionario
	public static void Search(String word) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		 dictionary.put("gato", "cat"); 
		 dictionary.put("perro" , "dog"); 
		 dictionary.put("pato" , "duck"); 
		 dictionary.put("vaca", "cow"); 
		 dictionary.put("oveja" , "sheep"); 
		 dictionary.put("conejo" , "rabbit"); 
		 dictionary.put("cerdo", "pig"); 
		 dictionary.put("gallina" , "hen"); 
		 dictionary.put("perico" , "parakeet"); 
		 dictionary.put("pez", "fish"); 
		 dictionary.put("jirafa" , "giraffe"); 
		 dictionary.put("pulpo" , "octopus"); 
		 dictionary.put("tigre", "tiger"); 
		 dictionary.put("oso" , "bear"); 
		 dictionary.put("lobo" , "wolf"); 
		 dictionary.put("elefante", "elefant"); 
		 dictionary.put("calamar" , "squid");
		 dictionary.put("caballo", "horse"); 
		 dictionary.put("ballena" , "whale"); 
		 dictionary.put("foca" , "seal"); 
		
		
		//Buscar la palabra en el diccionario y mostrar su traduccion. Si no se encuentra, informar al usuario
		if(dictionary.containsKey(word)) {
			 System.out.println(dictionary.get(word));
		 } else {
			 System.out.println("La palabra no se encuentra en el diccionario");
		 }
	}
	
	public static void main(String[] args) {
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Este es un programa que contiene un diccionario Español-Inglés de animales");
		 System.out.println("Introduce una palabra y te mostraremos la traducción al inglés");
		 String word = scanner.nextLine();
		 
		 Search(word);
		 scanner.close();
		 
	}

}
