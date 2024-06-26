package Objetos;

public class Arista {
    public int idProfesor;
    public int idAula;
    public int intervaloTiempo;

    Arista(int idProfesor, int idAula) {
        this.idProfesor = idProfesor;
        this.idAula = idAula;
        this.intervaloTiempo = -1;
    }
}