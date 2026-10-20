package modelos;

public class Barbero {
    private String id;
    private String nombre;
    private String especialidad;

    public Barbero(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    @Override
    public String toString() {
        return "ID: " + id + " | Barbero: " + nombre + " | Especialidad: " + especialidad;
    }
}