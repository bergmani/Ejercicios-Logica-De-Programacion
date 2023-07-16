/*
Crear un programa en `JavaScript` que realice lo siguiente:

- Pedir al usuario por prompt o input un número del 1 al 100 para adivinar un número secreto.


- Input
  - El dato ingresado por el usuario (número del 1 al 100).
  


- Output
  - Imprimir por consola o DOM un mensaje diciendo "Ups, el número secreto es incorrecto, vuelve a intentarlo." y volver a solicitarle que ingrese un número, en caso de no adivinar el número secreto.
  - Imprimir por consola o DOM un mensaje diciendo "Felicidades, adivinaste el número secreto." en caso de adivinar el número secreto.
  - Imprimr por consola o DOM la lista de númros introducidos antes de adivinar el número secreto.

--- 


## Consideraciones


- Identificar si los números ingresados son de tipo `number`, en caso contrario debe mostrarse un mensaje de error y volver a solicitar los datos.
- El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
- Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
- Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo `HTML` y enlazar tu script.
*/


const inputNumber = document.getElementById('inputNumber');
const guesses = document.getElementById('guesses');
const lastNumber = document.getElementById('lastNumber');
const guessing = document.getElementById('guessing');
const totalGuesses = document.getElementById('totalGuesses');
const error = document.getElementById('error');

const button = document.getElementById('button');

let randomNumber = Math.floor(Math.random() * 100) + 1;
let guessCount = 1;
let resetButton;

function guessTheNumber() {
  let eachGuess = Number(inputNumber.value);

  if(eachGuess >= 1 && eachGuess <= 100){
    if (guessCount === 1) {
      guesses.textContent = 'Intentos anteriores: ';
    }
    guesses.textContent += eachGuess + ' ';

    if (eachGuess === randomNumber) {
      lastNumber.textContent = '¡Felicidades! ¡Has adivinado!';
      lastNumber.style.backgroundColor = 'green';
      lastNumber.style.fontWeight = 'bold';
      lastNumber.style.fontSize = '2rem';
      totalGuesses.textContent = `Ganaste en ${guessCount} intentos`;
      guessing.textContent = '';

    } else {
      lastNumber.textContent = '¡Incorrecto!';
      lastNumber.style.backgroundColor = 'red';
      if(eachGuess < randomNumber) {
        guessing.textContent = 'El número que buscas es mayor';
      } else if(eachGuess > randomNumber) {
        guessing.textContent = 'El número que buscas es menor';
      }
    }

    guessCount++;
    inputNumber.value = '';
    error.textContent = '';
  } else{
    error.textContent = 'El número es entre 1 y 100, revisa que hayas puesto un número válido.'
    error.style.backgroundColor = 'yellow';
  }
}

button.addEventListener('click', guessTheNumber);