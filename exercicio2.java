import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = 6371.01;

        
        System.out.print("Latitude da coordenada 1: ");
        double lat1 = scanner.nextDouble(); 
        System.out.print("Longitude da coordenada 1: ");
        double lon1 = scanner.nextDouble(); 
        
        System.out.print("Latitude da coordenada 2: ");
        double lat2 = scanner.nextDouble(); 
        System.out.print("Longitude da coordenada 2: ");
        double lon2 = scanner.nextDouble(); 
        
        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(lon1);
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(lon2);

        
        double d = raio * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("A distância entre esses pontos é: " + d + " km");
        
        scanner.close();
    }
}
