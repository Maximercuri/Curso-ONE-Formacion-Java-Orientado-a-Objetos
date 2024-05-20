public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        //double son datos de tipo fluctuante o con cifra decimal
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);
        String sinopsis = """
                          Matrix es una paradoja
                          La mejor pelicula del fin del milenio
                          Fue lanzada en:
                          """ + fechaDeLanzamiento;
        // Las triples comillas, también llamados como Text Blocks, es una forma de escribir un texto tipo string de forma multilínea
        System.out.println(sinopsis);
        int clasificacionEnEstrellas = (int) media / 2;
        }
                 }

// "valor += ..." equivale a "valor = valor + ..."

/* Los comentarios en java escritos con "//" solo abarcan la línea del código usado y solo se ponen en el inicio,
   mientras que los escritos con los símbolos de esta sentencia se pueden extender más de una línea mientras se cierre la sentencia con el símbolo opuesto */

// + es suma, - es resta, * es multiplicación, / es division y % es resto de una division

// = es "asignar valor", == es "igual a", > es mayor, < es menor

/* "...&&..." Es el operador lógico "y" que compara 2 valores booleanos (si o no) y devuelve un valor booleano si se cumplen las 2 condiciones;
   "...||..." Es el operador lógico "o" que compara 2 valores booleanos (si o no) y devuelve un valor booleano si se cumple al menos 1 de las condiciones;
   "!..." Es el operador lógico "No" que devuelve el valor opuesto al recibido (si se pide NO 6 y es un 6, devuelve falso) */

/* "Variable++" es el operador post-incremento que aumenta en uno el valor de la variable luego de haberla utilizado en una expresión
   "++Variable" es el operador pre-incremento que aumenta en uno el valor de la variable antes de haberla utilizado en una expresión

   ejemplo práctico de cada uno:

   operador pre-incremento
   int num = 5;
   int resultado = ++num; ("num" es incrementado a 6 y después "resultado" se le da el nuevo valor de "num")
   System.out.println(num);  (imprime 6, el nuevo valor de "num")
   System.out.println(resultado);  (imprime 6, el nuevo valor de "num")

   operador post-incremento
   int num = 5;
   int resultado = num++; ("num" es atribuido primero a la variable "resultado" y después "num" es incrementado a 6)
   System.out.println(num); (imprime 6, el nuevo valor de "num")
   System.out.println(resultado); (imprime 5, el valor original de "num") */

/* Convenciones de usos de mayúsculas:
   Si es una clase: empieza en Mayúscula y cada nueva palabra empieza con Mayúscula (Upper CamelCase). Ejemplo: MiClase
   Si es un método/función: empieza en minúscula y cada nueva palabra empieza con Mayúscula (camelCase). Ejemplo: miMétodo
   Si es una constante: se escribe completamente en MAYÚSCULAS y cada palabra se separa con guion bajo. Ejemplo: MI_CONSTANTE
   Si es una variable: empieza en minúscula y cada nueva palabra empieza con Mayúscula (camelCase). Ejemplo: miVariable */

/* Tipos de primitivos:
   boolean: Representan valores lógicos (true or false)
   byte: Representan valores numéricos enteros de 8 bits (valores de -128 a 127)
   char: Almacena caracteres, cualquiera del Unicode; de forma individual. Se escribe entre "".
   short: Representan valores numéricos enteros de 16 bits (valores de -32.768 a 32.767)
   int: Representan valores numéricos enteros de 32 bits (valores de -2.147.483.648 a 2.147.483.647)
   long: Representan valores numéricos enteros de 64 bits (valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
   float: Representan valores numéricos racionales, es decir con coma, de 32 bits. Puede almacenar hasta 7 decimales y tiene precision limitada (es decir que redondea si es un número muy grande o pequeño)
   double: Representan valores numéricos racionales, es decir con coma, de 64 bits. Puede almacenar hasta 15 decimales y tiene precision limitada (es decir que redondea si es un número muy grande o pequeño) */

/* string.format(...) es un método capaz de dar un formato a un texto con marcadores de posición llamados placeholders.
   Los distintos tipos de placeholders son:
   %s (representa que en esa posición se debe insertar una cadena de texto)
   %d (representa que en esa posición se debe insertar un valor entero)
   %.(num)f (representa que en esa posición se debe insertar un valor decimal con (num) cantidad de decimales) */

/* Casting: es un recurso de transformación de un tipo de dato a otro.
   Se puede hacer de forma implícita cuando los tipos de datos son compatibles (es decir que todos los valores del tipo de dato inicial a convertir al tipo de dato destino)
   o se puede hacer de forma explícita cuando los tipos son incompatibles.
   Ejemplo de cada uno:
   Implícito: int X = 10;
              double y = x;
              System.out.println(y); (mostraría 10)

   Explicito: double x = 10.5;
              int y = (int) x;
              System.out.println(y); (mostraría 10 porque el valor decimal se vería truncado) */

/* Switch Case: es una estructura que cumple la misma función que un else-if anidado puesto que dada una variable se toman los posibles valores y se hace una acción en cada caso.
   Modelo de su uso:
   switch (variable) {
  case valor1:
        código a ejecutar si la expresión es igual a valor1;
        break;
  case valor2:
        código a ejecutar si la expresión es igual a valor2;
        break;
  case ... :
        código a ejecutar si la expresión es igual a ...;
        break;
  default:
        código a ejecutar si ninguno de los casos anteriores se cumple;
        break;
                    } */

