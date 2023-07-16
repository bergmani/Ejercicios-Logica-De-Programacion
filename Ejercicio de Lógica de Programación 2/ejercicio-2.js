/*
Crear un programa en `JavaScript` que realice lo siguiente:

- Input
- Solicitar al usuario por input o prompt la temperatura en grados Celcius.



- Output
- Imprimir por consola o DOM la temperatura ingresada convertida de grados Celsius a grados Farenheit.
- Imprimir por consola o DOM la temperatura ingresada convertida de grados Celsius a grados Kelvin.

--- 

Input:
```
45
```
Output:
``` 
Grados Fahrenheit: 113
Grados Kelvin: 318.15
```

## Consideraciones


- Identificar si los números ingresados son de tipo `number`, en caso contrario debe mostrarse un mensaje de error y volver a solicitar los datos.
- Si no conoces las fórmulas para las conversiones, puedes apoyarte de `Google`.
- Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
- Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo `HTML` y enlazar tu script.
*/

const inputCelcius = document.getElementById('inputCelcius');
const button = document.getElementById('converterButton');
const result = document.getElementById('result');

const pFarenheit = document.createElement('p');
const pKelvin = document.createElement('p');



button.addEventListener('click', () => {
    let celcius = parseFloat(inputCelcius.value);
    let farenheit = 0;
    let kelvin = 0;

    farenheit = (celcius * 1.8) + 32;
    kelvin = celcius + 273.15;

    let textFarenheit = `Grados Fahrenheit: ${farenheit}`;
    let textKelvin = `Grados Kelvin: ${kelvin}`;

    pFarenheit.textContent = textFarenheit;
    pKelvin.textContent = textKelvin;
    
    result.appendChild(pFarenheit);
    result.appendChild(pKelvin);
});



