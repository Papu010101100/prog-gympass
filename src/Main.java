public class Main {
    public static void main(String[] args) {
        // 2 socios
        Socio s1 = new Socio(1, "Isidro");
        Socio s2 = new Socio(2, "Juan");

        // 2 salas
        Sala sala1 = new Sala(10, "Spinning");
        Sala sala2 = new Sala(20, "Yoga");

        System.out.println("Socios");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Salas");
        System.out.println(sala1);
        System.out.println(sala2);
    }
}