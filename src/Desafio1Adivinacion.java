import java.util.Locale;
import java.util.Scanner;

/*12
Desafío: juego de adivinación
Crea un programa que simule un juego de adivinanzas.
El programa debe generar un número aleatorio entre 0 y 100,
y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
 En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.
Consejos:
Para generar un número aleatorio en Java: new Random().nextInt(100);
Utiliza el Scanner para obtener los datos del usuario.
Utiliza una variable para contar los intentos.
Utiliza un bucle para controlar los intentos.
Utiliza la instrucción ‘break;’ para salir del bucle.
*/
public class Desafio1Adivinacion {
    public static void main(String[] args) {
        /*!! OJO  agregar use Locale porque no toma el punto para separar decimales*/
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int numSecreto = (int)(Math.random() * 101);  // Multiplicamos por 101 para incluir el 100 y luego lo casteo a entero
        int cantIntentos = 5;
        int intento = -1;
        System.out.println("");
        System.out.println("***Bienvenido al adivinador***");

        System.out.println(numSecreto);

        while (cantIntentos > 0){

            System.out.println("Intente adivinar el número secreto (tiene " + cantIntentos + " intentos)");
            intento = teclado.nextInt();
            cantIntentos--;

            if (numSecreto == intento){
                System.out.println("¡ GANÓ ! Adivinó el número secreto: " + numSecreto);
                break;
            }else if (intento < numSecreto){
                System.out.println("No adivinó. El número Secreto es mayor");
            }else{
                System.out.println("No adivinó. El número secreto es menor.");
            }
        }
        System.out.println("Superó la cantidad máxima de intentos.");
    }
}
