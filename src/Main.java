import utilidades.Validador;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        
        do {
            System.out.println("\n=================================");
            System.out.println("    BARBERÍA MERO ESTILO (CLI)   ");
            System.out.println("=================================");
            System.out.println("1. Registrar / Consultar Clientes");
            System.out.println("2. Gestionar Barberos y Servicios");
            System.out.println("3. Agendar Cita");
            System.out.println("4. Consultar Agenda y Reportes");
            System.out.println("5. Salir");
            
            opcion = Validador.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    System.out.println("\n👉 Módulo de Clientes en desarrollo...");
                    break;
                case 2:
                    System.out.println("\n👉 Módulo de Barberos y Servicios en desarrollo...");
                    break;
                case 3:
                    System.out.println("\n👉 Módulo de Agendamiento en desarrollo...");
                    break;
                case 4:
                    System.out.println("\n👉 Módulo de Reportes en desarrollo...");
                    break;
                case 5:
                    System.out.println("\n👋 ¡Gracias por usar Mero Estilo! Saliendo del sistema...");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}