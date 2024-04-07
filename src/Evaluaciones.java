import java.util.Locale;
import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        /*!! OJO  agregar use Locale porque no toma el punto para separar decimales*/
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double nota = 0;
        double sumaEvaluciones = 0;
        int contadorDeEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Ingresa la nota que le das a la película: ");
            nota = teclado.nextDouble();

            if (nota != -1){
                sumaEvaluciones += nota;
                contadorDeEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones es: " + sumaEvaluciones/contadorDeEvaluaciones);
    }
}
