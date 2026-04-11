import java.util.Scanner;

public class InformacionTemas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcion;

        // Solicitar tema
        System.out.println("Ingresa un tema (artista, película, serie o persona): ");
        opcion = scanner.nextLine().toLowerCase();

        // Estructura switch
        switch (opcion) {

            // 🎤 Artistas
            case "eminem":
                System.out.println("Eminem: Rapero.");
                break;

            case "tupac":
                System.out.println("Tupac: Rapero gangster.");
                break;

            case "kanye west":
                System.out.println("Kanye West: Rapero exótico, Yeezy.");
                break;

            // 🎬 Películas
            case "point break":
                System.out.println("Point Break: Película de aventura.");
                break;

            case "13 fantasmas":
                System.out.println("13 Fantasmas: Película de miedo.");
                break;

            case "zombieland":
                System.out.println("Zombieland: Película de comedia.");
                break;

            // 📺 Series
            case "vikingos":
                System.out.println("Vikingos: Excelente serie.");
                break;

            case "juego de tronos":
                System.out.println("Juego de Tronos: Serie magnífica.");
                break;

            case "breaking bad":
                System.out.println("Breaking Bad: Serie suprema.");
                break;

            // 🌍 Personas destacadas
            case "cristiano ronaldo":
                System.out.println("Cristiano Ronaldo: Jugador histórico.");
                break;

            case "keanu reeves":
                System.out.println("Keanu Reeves: Actor.");
                break;

            case "saitama":
                System.out.println("Saitama: Personaje de One Punch Man.");
                break;

            default:
                System.out.println("No tengo información sobre ese tema.");
        }

        scanner.close();
    }
}