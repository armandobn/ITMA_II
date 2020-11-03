# Complejidad Computacional

## Definición Algoritmo de orden constante O(1)

Es una operación simple, unitaria, por ejemplo, asignar un valor a una variable, añadir a un vector, etc.
Se dice que un algoritmo es tiempo constante (también escrito como tiempo O(1)) si el valor de T(n) está limitado por un valor que no depende del tamaño de la entrada
Si T(n) es O(cualquier valor constante) se indica en notación estándar como T(n) siendo O(1).

## Definición y ejemplo Algoritmo de orden logarítmico O(log*n)

Un algoritmo O(log n) se considera altamente eficiente, ya que la relación entre el número de operaciones y el tamaño de la entrada disminuye y tiende a cero cuando aumenta n. Un algoritmo que debe acceder a todos los elementos de su entrada no puede tomar tiempo logarítmico ya que el tiempo necesario para leer una entrada de tamaño n es del orden de n.

* Ejemplo
Es la búsqueda dentro de un diccionario. Considere un diccionario D que contiene n entradas, ordenadas por orden alfabético. Suponemos que, para 1 ≤ k ≤ n, uno puede acceder a la entrada k del diccionario en un tiempo constante. Usemos D(k) para denotar la k-ésima entrada. Bajo estas hipótesis, la prueba de si una palabra w está en el diccionario se puede hacer en tiempo logarítmico

## Definición y ejemplo Algoritmo de orden lineal O(n)

Informalmente esto significa que el tiempo de ejecución aumenta como máximo linealmente con el tamaño de la entrada. Más precisamente, esto significa que hay una constante c tal que el tiempo de ejecución es como máximo cn para cada entrada de tamaño n.

* Ejemplo:
Un procedimiento que suma todos los elementos de una lista requiere un tiempo proporcional a la longitud de la lista, si el tiempo de adición es constante o, al menos, está limitado por una constante.

## Ejemplo de algoritmo de orden nlogn O(n log* n)

Quicksort, O(n log n), en su versión aleatoria, tiene un tiempo de ejecución que es O(n log n) en espera de la entrada del peor de los casos. Su versión no aleatoria tiene un tiempo de ejecución O(n log n) solo cuando se considera la complejidad promedio de los casos.

## Definición y ejemplo de un algoritmo de orden cuadrático O(n2)

Aplicable a bucles anidados, el primer bucle se ejecuta n veces y el segundo (interno) también n veces. Por lo tanto, la instrucción en el bucle interno se ejecuta un total de n * n veces, algo no deseable para grandes conjuntos de datos (n).

* Ejemplo
Los algoritmos de ordenamiento simples basados en la comparación son cuadráticos (por ejemplo, ordenamiento por inserción) pero se pueden encontrar algoritmos más avanzados que son subcuadráticos (por ejemplo, ordenamiento shell). Ningún algoritmo de ordenamiento de propósito general se ejecuta en tiempo lineal pero la reducción de un tiempo cuadrático a uno subcuadrático es de gran importancia práctica.

## Definición de un algoritmo de orden polinomial O(n3)

Se dice que un algoritmo es de tiempo polinómico si su tiempo de ejecución está limitado por una expresión polinómica en el tamaño de la entrada para el algoritmo, es decir, T (n) = O(nk) para alguna constante positiva k.19 Los problemas para los que existe un algoritmo de tiempo polinómico determinista pertenecen a la clase de complejidad P, que es central en el campo de la teoría de la complejidad computacional.

## Definición de un algoritmo de orden exponencial O(an)

Itera a través de todos los subconjuntos de los elementos de entrada.
Se dice que un algoritmo es de tiempo exponencial, si T(n) está limitado por 2poly(n), donde poly(n) es un polinomio en n. Más formalmente, un algoritmo es de tiempo exponencial si T(n) está limitado por O(2nk) para alguna constante k. Los problemas que admiten algoritmos de tiempo exponencial en una máquina de Turing determinista forman la clase de complejidad conocida como EXP.

## Definición de un algoritmo de orden factorial O(n!)

Itera a través de todas las permutaciones de los elementos de entrada.
Orden factorial Es el típico de aquellos algoritmos que para un problema complejo prueban todas las combinaciones posibles. O(n!) combinatorio tan intratable como el anterior. A menudo no se hace distinción entre ellos.