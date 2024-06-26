package Objetos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProgramadorHorarios {
    public static void colorearAristas(Grafo grafo) {
        int maxIntervaloTiempo = 0;
        Map<Integer, Set<Integer>> intervalosTiempo = new HashMap<>();

        for (Arista arista : grafo.aristas) {
            Set<Integer> intervalosNoDisponibles = new HashSet<>();
            Nodo profesor = null, aula = null;

            // Encontrar los nodos correspondientes a profesor y aula
            for (Nodo nodo : grafo.nodos) {
                if (nodo.id == arista.idProfesor) {
                    profesor = nodo;
                }
                if (nodo.id == arista.idAula) {
                    aula = nodo;
                }
            }

            // Encontrar intervalos de tiempo no disponibles para la arista actual
            for (Arista otraArista : grafo.aristas) {
                if ((arista.idProfesor == otraArista.idProfesor || arista.idAula == otraArista.idAula) && otraArista.intervaloTiempo != -1) {
                    intervalosNoDisponibles.add(otraArista.intervaloTiempo);
                }
            }

            // Asignar el primer intervalo de tiempo disponible dentro de la disponibilidad del profesor
            int intervaloTiempo = profesor.horaInicio;
            while (intervalosNoDisponibles.contains(intervaloTiempo) ||
                    intervaloTiempo >= profesor.horaInicio + profesor.bloquesDisponibles) {
                intervaloTiempo++;
                if (intervaloTiempo >= profesor.horaInicio + profesor.bloquesDisponibles) {
                    System.err.println("No hay bloques de tiempo disponibles para Profesor " + profesor.id + " y Aula " + aula.id);
                    return;
                }
            }
            arista.intervaloTiempo = intervaloTiempo;
            intervalosTiempo.computeIfAbsent(intervaloTiempo, k -> new HashSet<>()).add(arista.idProfesor);
            intervalosTiempo.computeIfAbsent(intervaloTiempo, k -> new HashSet<>()).add(arista.idAula);
            maxIntervaloTiempo = Math.max(maxIntervaloTiempo, intervaloTiempo);
        }

        System.out.println("El numero maximo de intervalos de tiempo necesarios es: " + (maxIntervaloTiempo + 1));
    }

    public static void imprimirHorario(Grafo grafo) {
        for (Arista arista : grafo.aristas) {
            int horaInicio = arista.intervaloTiempo + 7; // 0 equivale a las 7 AM
            System.out.println("Profesor " + arista.idProfesor + " tiene clase en Aula " + arista.idAula
                    + " en el intervalo de tiempo " + arista.intervaloTiempo + " ("
                    + horaInicio + ":00 - " + (horaInicio + 1) + ":00)");
        }
    }
}
