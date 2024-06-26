package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    public List<Nodo> nodos = new ArrayList<>();
    public List<Arista> aristas = new ArrayList<>();

    public void agregarProfesor(int id, String turno, int horaInicio, int bloquesDisponibles) {
        int horaBloqueInicio;
        if (turno.equals("mañana")) {
            if (horaInicio < 7 || horaInicio >= 12) throw new IllegalArgumentException("Hora de inicio no valida para turno mañana");
            horaBloqueInicio = horaInicio - 7;
        } else if (turno.equals("tarde")) {
            if (horaInicio < 12 || horaInicio >= 18) throw new IllegalArgumentException("Hora de inicio no valida para turno tarde");
            horaBloqueInicio = horaInicio - 7;
        } else if (turno.equals("noche")) {
            if (horaInicio < 18 || horaInicio >= 24) throw new IllegalArgumentException("Hora de inicio no valida para turno noche");
            horaBloqueInicio = horaInicio - 7;
        } else {
            throw new IllegalArgumentException("Turno no valido");
        }
        nodos.add(new Nodo(id, "profesor", horaBloqueInicio, bloquesDisponibles, turno));
    }

    public void agregarAula(int id) {
        nodos.add(new Nodo(id, "aula", 0, 0, ""));
    }

    public void agregarArista(int idProfesor, int idAula) {
        aristas.add(new Arista(idProfesor, idAula));
    }
}