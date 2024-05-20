public class Desiciones {
    public static void main(String[] args) {
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        int fechaDeLanzamiento = 1999;
        String plan = "plus";
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Películas mas populares"); }
        else {
            System.out.println("Pelicula Retro que aun vale la pena ver"); }
        if (incluidoEnElPlan || plan.equals("plus")){
            System.out.println("Disfrute de su Pelicula"); }
        else {
            System.out.println("Esta pelicula no está incluida dentro de su plan"); }
    };
}
