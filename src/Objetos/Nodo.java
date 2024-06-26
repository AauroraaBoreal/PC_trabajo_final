package Objetos;

public class Nodo {
    public int id;
    public String tipo; // "profesor" o "aula"
    public int horaInicio; // Hora de inicio en bloques de 1 hora (0 = 7 AM, 1 = 8 AM, etc.)
    public int bloquesDisponibles; // Número de bloques de 1 hora disponibles
    public String turno; // "mañana", "tarde" o "noche"

    public Nodo(int id, String tipo, int horaInicio, int bloquesDisponibles, String turno) {
        this.id = id;
        this.tipo = tipo;
        this.horaInicio = horaInicio;
        this.bloquesDisponibles = bloquesDisponibles;
        this.turno = turno;
    }
}
