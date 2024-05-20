public class Main {
    public static void main(String[] args) {
        /* Parte 1: Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
           Utiliza variables para representar los valores de las temperaturas
           Imprime en la consola el valor convertido de Celsius a Fahrenheit.
           Nota: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32 */
        double temperaturaCelsius = 30.68;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        String MensajeEquivalencia = String.format("%2f° en celsius es equivalente a %.3f° en fahrenheit", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(MensajeEquivalencia);
        /* Parte 2: Después de verificar que el programa se haya ejecutado correctamente,
           Crea una variable entera para mostrar la temperatura en Fahrenheit sin decimales */
        int fahrenheitTruncado = (int) temperaturaFahrenheit;
        System.out.println("La temperatura entera en fahrenheit es de " + fahrenheitTruncado);}
}