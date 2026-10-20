package modelos;

public class Cliente {
    private String cedula;
    private String nombre;
    private String telefono;

    public Cliente(String cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return "Cédula: " + cedula + " | Nombre: " + nombre + " | Teléfono: " + telefono;
    }
}