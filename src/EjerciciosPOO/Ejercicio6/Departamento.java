package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;
    private List<Catedra> catedras;

    public Departamento(String nombre, List<Profesor> profesores) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.catedras = new ArrayList<>();
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addCatedra(Catedra c) {
        catedras.add(c);
    }

    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
