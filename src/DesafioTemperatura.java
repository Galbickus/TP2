/*¡Ahora te toca a ti! Práctica los conceptos que se enseñaron a lo largo de esta lección con el siguiente desafío:
Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit. Utiliza variables para representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a Fahrenheit.
Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.
Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente, crea una variable entera para mostrar la temperatura en Fahrenheit sin decimales. Recuerda que probablemente necesitarás realizar un casting de valores.*/

public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }

}

