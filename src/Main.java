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

        int clasificacion = (int) media / 2;
        System.out.println("Estrellas para esta película: " + clasificacion);


        double gradosCelsius = 30.4;
        double gradosFharenheit = gradosCelsius * 1.8 + 32;

        System.out.println(gradosCelsius + " grados Celsius equivalen a " + gradosFharenheit + " grados Fharenhait.");

    }
}