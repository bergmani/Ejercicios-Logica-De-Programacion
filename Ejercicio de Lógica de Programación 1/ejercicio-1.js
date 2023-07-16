/*# Ejercicio 1

## Instrucciones

- Crear un programa en `JavaScript` que realice lo siguiente:

- Input
  - Solicitar por prompt tres datos y guardarlos en sus respectivas variables.


- Output
  - Mostrar los números por consola o DOM ordenados de mayor a menor, y de menor a mayor.
  - Mostrar un mensaje en consola o por el DOM si los números son iguales.

--- 

Input:
```
4, 4, 2
```
Output:
``` 
4, 4, 2
2, 4, 4
```

## Consideraciones


- Al analizar los números, deberás identificar cual es el número mayor, el número del centro y el número menor.
- Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
- Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo `HTML` y enlazar tu script.
*/

//Instrucciones
alert('Introduzca 3 números y los ordenaremos de mayor a menor, le diremos si los 3 números son iguales.');
let a = Number(prompt('Escriba el primer número'));
let b = Number(prompt('Escriba el segundo número'));
let c = Number(prompt('Escriba el tercer número'));

//Variables que guardarán los resultados
let equal = '';
let increasing = '';
let decreasing = '';

//Condicionales
  if(a == b && b == c){
    equal = `Los tres numeros  son iguales: ${a}, ${b}, ${c}`;
  }
  else if (a <= b && b <= c){
    decreasing = `${c}, ${b}, ${a}`;
    increasing =  `${a}, ${b}, ${c}`;
  } else if (a <= c && c <= b){
    decreasing = `${b}, ${c}, ${a}`;
    increasing = `${a}, ${c}, ${b}`;
  } else if (b <= a && a <= c){
    decreasing = `${c}, ${a}, ${b}`;
    increasing = `${b}, ${a}, ${c}`;
  } else if (b <= c && c <= a){
    decreasing = `${a}, ${c}, ${b}`;
    increasing = `${b}, ${c}, ${a}`;
  } else if (c <= a && a <= b){
    decreasing = `${b}, ${a}, ${c}`;
    increasing = `${c}, ${a}, ${b}`;
  } else if (c <= b && b <= a){
    decreasing = `${a}, ${b}, ${c}`;
    increasing = `${c}, ${b}, ${a}`;
  } 

//Llamar div del DOM
const result = document.getElementById('result');

//Creando parrafos para mostrar los resultados
const pEqual = document.createElement('p');
const pIncreasing = document.createElement('p');
const pDecreasing = document.createElement('p');

//Poblar los parrafos con las variables que guardan los resultados
pEqual.textContent = equal;
pIncreasing.textContent = increasing;
pDecreasing.textContent = decreasing;

//Añadit los parrafos dentro del div 
result.appendChild(pEqual);
result.appendChild(pDecreasing);
result.appendChild(pIncreasing);
