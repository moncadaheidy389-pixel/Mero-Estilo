package modelos;

public class Cita {
    private String idCita;
    private Cliente cliente;
    private Barbero barbero;
    private Servicio servicio;
    private String fechaHora;
    private String estado; // "AGENDADA", "ATENDIDA", "CANCELADA"

    public Cita(String idCita, Cliente cliente, Barbero barbero, Servicio servicio, String fechaHora) {
        this.idCita = idCita;
        this.cliente = cliente;
        this.barbero = barbero;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
        this.estado = "AGENDADA";
    }

    public String getIdCita() { return idCita; }
    public Cliente getCliente() { return cliente; }
    public Barbero getBarbero() { return barbero; }
    public Servicio getServicio() { return servicio; }
    public String getFechaHora() { return fechaHora; }
    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Cita ID: " + idCita + " | Cliente: " + cliente.getNombre() + " | Barbero: " + barbero.getNombre() + 
               " | Servicio: " + servicio.getNombre() + " | Fecha/Hora: " + fechaHora + " | Estado: " + estado;
    }
}