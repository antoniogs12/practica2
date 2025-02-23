# Práctica 2: Aproximación Recursiva de π con el Método de Montecarlo

## Descripción
Este proyecto implementa una aproximación recursiva del número π utilizando el método de Montecarlo. La práctica se basa en la implementación previa de la versión iterativa y ahora se transforma en una solución recursiva en Java.

## Funcionamiento
El programa genera puntos aleatorios dentro de un cuadrado de lado 1 y cuenta cuántos de ellos caen dentro de un círculo de radio 1. La proporción de puntos dentro del círculo respecto al total de puntos generados se usa para estimar π mediante la fórmula:

\[ \pi \approx 4 \times \frac{aciertos}{total\_puntos} \]

El proceso se realiza de manera recursiva, reduciendo el número de pasos hasta alcanzar el caso base.

## Estructura del Código
- **Matematicas.java**: Contiene la función recursiva `generarNumeroPiRecursivo`.
- **Principal.java**: Ejecuta el programa, recibiendo como argumento la cantidad de puntos a generar.

## Uso
### Compilar
Ejecuta el siguiente comando en la terminal:

```sh
javac -d bin src/mates/Matematicas.java src/aplicacion/Principal.java
```

### Ejecutar
Para ejecutar el programa, usa:

```sh
java -cp bin aplicacion.Principal 1000000
```

Donde `1000000` es el número de puntos a generar.

## Autor
- Antonio García Subiela

