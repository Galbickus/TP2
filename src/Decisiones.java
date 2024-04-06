public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double nota = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Películas más populares");
        }else{
            System.out.println("Películas retro que aún vale la pena ver");
        }
        if (incluidoEnElPlan || tipoPlan == "plus"){
            System.out.println("Disfrute de su película");
        }else {
            System.out.println("Película no incluída en su plan actual");
        }
    }
}
