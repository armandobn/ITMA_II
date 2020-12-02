# Generacion de Codigo Intermedio

El código intermedio elimina la necesidad de un nuevo compilador completo para cada máquina de la sección de análisis mismo de todos los compiladores.
Es más fácil de aplicar las modificaciones del código fuente para mejorar rendimiento del código mediante la aplicación de técnicas de optimización código en el código intermedio.
El código intermedio se encuentra entre el código fuente y el código objeto.
El código intermedio elimina la necesidad de un nuevo compilador completo para cada maquina de la sección de análisis mismo de todos los compiladores
El generador de código intermedio, trata de dividir la expresión en sub expresiones que generan el código correspondiente.

## Formas de representación código intermedio

* Arboles sintácticos
* Notación postfija
* Código en tres direcciones

## Reglas en el código en tres direcciones

**Primera:** Cada instrucción de tres direcciones contiene por lo menos un operador, además de la asignación
**Segunda:** El traductor debe generar un nombre temporal para guardar los valores calculados por cada instrucción 
**Tercera:** algunas instrucciones de “tres direcciones” tienen menos de tres operandos.
