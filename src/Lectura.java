import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Introduzca el año de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Introduce la nota que das a esta película");
        double nota = teclado.nextDouble();
        System.out.println("----------");
        System.out.println("La película: " + pelicula + ", lanzada en " + fechaDeLanzamiento + " tiene " + nota + " de nota.");

    }
}
