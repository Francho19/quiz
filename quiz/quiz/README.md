Instrucción: Desarrolla un programa en Java que determine si dos números enteros positivos son "números amigos". El programa debe:
Solicitar al usuario dos números enteros positivos
Calcular la suma de los divisores propios de cada número (todos los divisores excepto el propio número)
Determinar si los números son amigos y mostrar el resultado
Dos números son considerados "amigos" si la suma de los divisores propios del primer número es igual al segundo número, y la suma de los divisores propios del segundo número es igual al primer número.
Por ejemplo:
Los divisores propios de 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 (suma: 284)
Los divisores propios de 284 son: 1, 2, 4, 71, 142 (suma: 220)
Como la suma de los divisores de 220 es 284 y la suma de los divisores de 284 es 220, estos números son amigos.
El programa debe implementar una función para calcular la suma de los divisores propios de un número y usar solo operaciones aritméticas básicas, condicionales y bucles.
Ejemplo de ejecución:
Ingrese el primer número: 220
Ingrese el segundo número: 284
Los divisores propios de 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
La suma de los divisores propios de 220 es: 284
Los divisores propios de 284 son: 1, 2, 4, 71, 142
La suma de los divisores propios de 284 es: 220
¡220 y 284 son números amigos!



Documentacion
Instrucción: Desarrolla un programa en Java que determine si dos números enteros positivos son "números amigos". El programa debe:
1) se pide ingresar los números por teclado utilizando Scanner.
2)Se utilaza una división  con los numeros siempre que nos el residuo (%) nos de diferente de 1 y esta residio nos daria 0.
3)Se hace un para (for), se inicializa una variable para poder hacer el incremento (++), la variable que tuvimos la igualamos a 1 y despues a esa misma variable la a se la asignamos mayor igual al numero que le ingresamos y si es un número amigo nos dara el residuo igual a cero (0), se utiliza un si (if) si nos da cero (0), la suma nos va a dar igual al igual el otro número, es decir,si cumple,. si no, no son numeros amigos.