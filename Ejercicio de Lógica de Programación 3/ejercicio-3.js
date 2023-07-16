/*
Crear un programa en `JavaScript` que realice lo siguiente:

- Input
    Solicitar por prompt o input un número

- Output
    Imprimir por consola o DOM el factorial del número recibido.
--- 

Input:
```
5
```
Output:
``` 
120
```

## Consideraciones


- Identificar si los números ingresados son de tipo `number`, en caso contrario debe mostrarse un mensaje de error y volver a solicitar los datos.
- El `factorial` de un número es igual al producto de todos los números enteros positivos desde el 1 hasta dicho número, ejemplo 4! = 1x2x3x4=24.
- Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
- Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo `HTML` y enlazar tu script.
 */
const inputFactorial = document.getElementById('inputFactorial');
const button = document.getElementById('calculateButton');
const result = document.getElementById('result');

const factorialResult = document.createElement('p');


button.addEventListener('click', () => {
    let factorial = parseFloat(inputFactorial.value);

    let factorialTotal= 1;
    for (let i = 1 ; i <= factorial; i ++){
            factorialTotal *= i;
        } 

    factorialResult.textContent = factorialTotal;
    
    result.appendChild(factorialResult);
});

