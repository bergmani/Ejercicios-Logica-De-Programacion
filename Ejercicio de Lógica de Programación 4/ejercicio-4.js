/*
Crear un programa en `JavaScript` que realice lo siguiente:

- Input
  - Solicitar por prompt o input un número.
  


- Output
  - Imprimir por consola o DOM la serie de fibonacci dependiendo el número recibido.
--- 

Input:
```
3
```
Output:
``` 
0, 1, 1
```

## Consideraciones


- Identificar si los números ingresados son de tipo `number`, en caso contrario debe mostrarse un mensaje de error y volver a solicitar los datos.
- Debe imprimirse la serie de Fibonacci dependiendo del número, es decir, si el programa recibe un 10, debe mostrar 10 números de la serie de Fibonacci.
- La `serie de Fibonacci` es una secuencia infinita de números naturales; a partir del 0 y del 1, se van sumando a pares, de manera que cada número es igual a la suma de sus dos anteriores, de manera que la sucesión de Fibonacci del numero 10 es: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
- Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
- Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo `HTML` y enlazar tu script.


*/

const inputFibonacci = document.getElementById('inputFibonacci');
const button = document.getElementById('button');
const result = document.getElementById('result');

const fibonacciResult = document.createElement('p');


button.addEventListener('click', () => {
    let fibonacciN = parseFloat(inputFibonacci.value);
    let fibonacci = [];
    let i = 2;
    
    if(fibonacciN == 0){
      fibonacci[0] = 0;
    } else if(fibonacciN == 1){
      fibonacci[0] = 0;
      fibonacci[1] = 1;
    } else if(fibonacciN >= 2){
    while (i < fibonacciN){
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        i++;
    }}
        fibonacciResult.textContent = fibonacci;
        result.appendChild(fibonacciResult);
});
