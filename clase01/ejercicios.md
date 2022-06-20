# Ejercicios

## Instrucciones
- Crear un proyecto para los ejercicios de la clase 1
  - Ctrl + Shift + P
  - > Java: Create Java Project...
  - No build tools
  -  Java project name: clase01
- Por cada ejercicio propuesto se creará una clase, con una función estática (método) que resuelva dicho ejercicio.
- Usar la función main() sólo para hacer el llamado a las funciones que se quieren probar. 
- (opcional) Crea un menú con las opciones para que el usuario pueda seleccionar que ejercicio desea ejecutar.

## Ejercicio 1
Implemente un algoritmo que dado un nombre en una variable de tipo cadena, imprima un saludo en consola.

## Ejercicio 2
Implemente un algoritmo que reciba un número por teclado y cuente cuántas cifras (o dígitos) contiene e imprima el mensaje en consola.

## Ejercicio 3
Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.

## Ejercicio 4
Escribe un programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)

## Ejercicio 5
Escribe un programa java que lea una variable de tipo entero por teclado.  
A continuación muestra un mensaje indicando si la variable es par o impar.  
Utiliza el _operador condicional_ ( ? : ) para resolverlo.
Ej: “14 es par” o “15 es impar”

## Ejercicio 6
Realizar la suma, la resta, la división y la multiplicación de dos números leídos por teclado y mostrar en pantalla `"La <operación> de <número 1> y <número 2> es igual a <resultado>"`.

## Ejercicio 7
Realizar un programa que realice el promedio de las notas de un alumno, para ello el programa va a tener que solicitar el nombre del alumno y las notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir “Reprobado”.  
**Nota**: Las notas que se ingresan pueden tener decimales.

## Ejercicio 8
Realizar un programa que calcule el sueldo de un trabajador, el programa solicita el número de horas que has trabajado en un mes, las horas se pagan a $30.000.

## Ejercicio 9 
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese número, desde el 0 hasta el 10.  
**Pista**: Usa un bucle `for` para recorrer la
tabla y mostrar los datos.

## Ejercicio 10 
Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que adivinar introduciendo el número por teclado. En el caso que el número a adivinar sea mayor al ingresado, decirle al usuario “El número que busca es mayor”, de lo contrario, “El número que busca es menor”. El programa finalizará cuando se introduzca el número correcto.  
*Nota*: usar la clase `Random` para generar el número aleatorio.

## Ejercicio 11 
Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y que calcule el peso ideal.
- peso ideal mujeres = altura - 110
- peso ideal hombres = altura - 100

## Ejercicio 12
Pedir un número, comprobar si es primo y preguntar si quiere introducir más (S/N) y volver a comenzar.

## Ejercicio 13
Realizar un programa que permita controlar el juego de piedra, papel, tijera introduciendo P para piedra, L para papel y T para tijera por cada jugador.  
El sistema debe indicar qué jugador gana la ronda o si hay empate.  
Al final de cada ronda preguntar si desea volver a jugar.
**Opcional**: Hacer que el computador juegue contra el jugador usando la clase `Random` para que el computador elija una de las opciones. 

## Ejercicio 14
Pide por teclado el nombre, edad y salario y muestra la información del empleado con el salario incrementado por la bonificación:
- Si es menor de 18 no tiene edad para trabajar
- Entre 30 y 50 años la bonificación es de un 5 por ciento más
- Entre 51 y 60 años la bonificación es de un 10 por ciento más
- Si es mayor de 60 la bonificación es de un 15 por ciento más

## Ejercicio 15
Muestra los números que pertenecen a la serie de fibonacci hasta un número pedido por teclado.  
Por ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.