package servicios;

import modelos.Cita;
import modelos.Cliente;
import modelos.Barbero;
import modelos.Servicio;
import java.util.ArrayList;

public class GestorCitas {
    private ArrayList<Cita> listaCitas = new ArrayList<>();

    // T-05 & T-08: Agendar cita validando cruces de horario para el mismo barbero
    public boolean agendarCita(String idCita, Cliente cliente, Barbero barbero, Servicio servicio, String fechaHora) {
        // Validar si el barbero ya tiene una cita en la misma fecha y hora
        for (Cita c : listaCitas) {
            if (c.getBarbero().getId().equals(barbero.getId()) && 
                c.getFechaHora().equalsIgnoreCase(fechaHora) && 
                !c.getEstado().equalsIgnoreCase("CANCELADA")) {
                System.out.println("❌ Error: El barbero " + barbero.getNombre() + " ya tiene una cita agendada en ese horario.");
                return false;
            }
        }

        Cita nuevaCita = new Cita(idCita, cliente, barbero, servicio, fechaHora);
        listaCitas.add(nuevaCita);
        System.out.println("✅ ¡Cita agendada con éxito!");
        return true;
    }

    // Consultar todas las citas (Agenda General)
    public void consultarAgendaGeneral() {
        if (listaCitas.isEmpty()) {
            System.out.println("ℹ️ No hay citas registradas en el sistema.");
            return;
        }
        System.out.println("\n--- AGENDA GENERAL DE CITAS ---");
        for (Cita c : listaCitas) {
            System.out.println(c);
        }
    }

    // T-06 / T-10: Registrar atención (Cambiar estado a ATENDIDA)
    public void marcarComoAtendida(String idCita) {
        for (Cita c : listaCitas) {
            if (c.getIdCita().equals(idCita)) {
                c.setEstado("ATENDIDA");
                System.out.println("✅ Cita " + idCita + " marcada como ATENDIDA.");
                return;
            }
        }
        System.out.println("❌ No se encontró la cita con ID: " + idCita);
    }

    // T-06: Cancelar una cita
    public void cancelarCita(String idCita) {
        for (Cita c : listaCitas) {
            if (c.getIdCita().equals(idCita)) {
                c.setEstado("CANCELADA");
                System.out.println("⚠️ La cita " + idCita + " ha sido CANCELADA.");
                return;
            }
        }
        System.out.println("❌ No se encontró la cita con ID: " + idCita);
    }

    // T-06: Consultar citas de un cliente específico
    public void consultarCitasPorCliente(String cedulaCliente) {
        System.out.println("\n--- CITAS DEL CLIENTE (Cédula: " + cedulaCliente + ") ---");
        boolean encontradas = false;
        for (Cita c : listaCitas) {
            if (c.getCliente().getCedula().equals(cedulaCliente)) {
                System.out.println(c);
                encontradas = true;
            }
        }
        if (!encontradas) {
            System.out.println("ℹ️ No hay citas registradas para este cliente.");
        }
    }

    // T-07: Calcular reporte de ingresos totales de citas atendidas
    public double calcularIngresosTotales() {
        double total = 0;
        for (Cita c : listaCitas) {
            if (c.getEstado().equalsIgnoreCase("ATENDIDA")) {
                total += c.getServicio().getPrecio();
            }
        }
        return total;
    }
}