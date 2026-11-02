import java.util.Scanner;
public class EncuestaEstudiantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int excelente = 0, bueno = 0, regular = 0, malo = 0;      
        for (int i = 1; i <= 30; i++) {
            System.out.print("Estudiante " + i + " - Ingrese opción (1=Excelente, 2=Bueno, 3=Regular, 4=Malo): ");
            int opcion = scanner.nextInt();         
            switch (opcion) {
                case 1: excelente++; break;
                case 2: bueno++; break;
                case 3: regular++; break;
                case 4: malo++; break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo para este estudiante.");
                    i--; // Repetir iteración
            }
        }
        System.out.println("Excelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);   
        String opcionMasVotada = "Excelente";
        int maxVotos = excelente;       
        if (bueno > maxVotos) { maxVotos = bueno; opcionMasVotada = "Bueno"; }
        if (regular > maxVotos) { maxVotos = regular; opcionMasVotada = "Regular"; }
        if (malo > maxVotos) { opcionMasVotada = "Malo"; }       
        System.out.println("Opción más votada: " + opcionMasVotada);
        scanner.close();
    }
}