package tf_pc;
import Objetos.Grafo;
import Objetos.ProgramadorHorarios;

public class Tf_pc {

    public static void main(String[] args) {
        //Principal formPrincipal = new Principal();
        //formPrincipal.setVisible(true);
        
        Grafo grafo = new Grafo();

        // Añadir profesores (nodos)
        grafo.agregarProfesor(1, "mañana", 8, 3); // Profesor 1 disponible de 8 AM a 11 AM
        grafo.agregarProfesor(2, "tarde", 13, 3);  // Profesor 2 disponible de 1 PM a 4 PM
        grafo.agregarProfesor(3, "noche", 19, 5);  // Profesor 3 disponible de 7 PM a 12 PM

        // Añadir aulas (nodos)
        grafo.agregarAula(4); // Aula 4
        grafo.agregarAula(5); // Aula 5

        // Añadir aristas (relaciones profesor-aula)
        grafo.agregarArista(1, 4);
        grafo.agregarArista(1, 5);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(2, 5);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(3, 5);

        // Ejecutar el algoritmo de coloración de aristas
        ProgramadorHorarios.colorearAristas(grafo);

        // Imprimir el horario generado
        ProgramadorHorarios.imprimirHorario(grafo);
        
    }
    
}
