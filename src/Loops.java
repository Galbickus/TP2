import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double suma = 0;
        int cantDePelisAEvaluar = 0;



        System.out.println("Ingrese la cantidad de notas a considerar: ");
        cantDePelisAEvaluar = teclado.nextInt();

        for (int i = 0; i < cantDePelisAEvaluar; i++) {
            System.out.println("Ingresa la nota que le das a la película: ");
            nota = teclado.nextDouble();
            suma = suma + nota;
        }

        mediaEvaluaciones = suma/ cantDePelisAEvaluar;
        System.out.println("El promedio de evaluación de la peli es: " + mediaEvaluaciones + ".");
    }
}
