package org.generation.ejercicio10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class EngSpaPractice {
	/*
	 Crear un programa en `Java` que realice lo siguiente:
	- Crear un diccionario Español-Inglés, que contenga al menos 20 palabras su respectiva traducción
	- Utilizar un *objeto* `HashMap` para almacenar los pares de palabras
	- Escoger al azar 5 palabars en español del mini diccionario
	
	- Input
	  - Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
	- Comprobar si el input es correcto
	- Output
	  - Mostrar cuántas respuestas correctas e incorrectas tiene el usuario
	
	--- 
	
	## Consideraciones
	
	- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
	- Prueba con diferentes input validos y no validos
	- Se puede agregar validación de input
	-  Puedes desarrollar el algoritmo y su pseudocódigo
	-  Por ser el ejercicio final, se evaluarán *todos los aspectos* de un buen código
	   -  Limpieza, legibilidad, simplicidad, documentación, etc...
	 */

	public static void Search() {
		//Creación del diccionario inglés-español
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

		 //Abrimos el scanner y explicamos el propósito del programa.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este es un programa que contiene un diccionario Español-Inglés de animales para ayudarte a practicar tu inglés.");
        System.out.println("Se te mostrarán 5 palabras y escribirás su traducción.");
        
        //Creamos lista de las keys de nuestro diccionario(las palabras en español)
        Set<String> keySet = dictionary.keySet();
		List<String> keyList = new ArrayList<>(keySet);
		
		//Verificamos la longitud de nuesta lista de palabras en español
        int size = keyList.size();
        
        //Creamos variables para contar las respuestas correctas e incorrectas
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        
        //iniciamos un bucle para las 5 palabras
        for(int i = 1; i <= 5; i++) {
        	//Abrimos un random, con un tope del tamaño de nuestro diccionario
        	int random = new Random().nextInt(size);
        	
        	//Creamos variables que contendrán: 1. palabra en español, y 2. palabra en inglés
        	String randomKey = keyList.get(random);
	        String randomValue = dictionary.get(randomKey);
	        
	        //Pedimos al usuario que escriba la traducción
			System.out.println("Escribe la traducción de " + randomKey + ":");
			//Guardamos respuesta en variable y la convertimos a minúsuclas para asegurarnos de que aunque usuario escriba en mayúscula al menos una letra, si la escribe correctamente aún pueda ser correcta.
			String word = scanner.nextLine().toLowerCase();
			
			//Realizamos una condicional
			//Si el valor (palabra en inglés) del diccionario es igual a lo escrito por el usuario, va a felicitarlo y la variable que contiene el numero de respuestas correctas aumenta
			if(randomValue.equals(word)) {
				System.out.println("¡Así se hace!");
				correctAnswers += 1;
			//Si lo anterior no se cumple, entonces menciona que la respuesta es equivocada y aumenta la variable de respuestas incorrectas
			} else {
				System.out.println("Lo sentimos. Respuesta equivocada");
				incorrectAnswers += 1;
			}
	
	        
        }
        System.out.println("Gracias por participar, obtuviste " + correctAnswers + " respuestas correctas y " + incorrectAnswers + " respuestas incorrectas.");
        scanner.close();
    }
		
	
	public static void main(String[] args) {		
		 Search();
	}

}
