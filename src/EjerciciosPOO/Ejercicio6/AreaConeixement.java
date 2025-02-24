package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AreaConeixement {
    private String nombre;
    private List<Departamento> departamentos;

    public AreaConeixement(String nombre, ArrayList<Departamento> departamentos) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
