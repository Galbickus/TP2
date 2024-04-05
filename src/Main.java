// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double nota = 8.2;
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);
        String sinopsis = """
                Matrix ees  uns película situada en un futuro distópico. 
                La mejor película del fin del milenio según El New Yorker.
                Fué lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

    }
}