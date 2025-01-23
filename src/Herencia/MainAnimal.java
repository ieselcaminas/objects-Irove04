package Herencia;

public class MainAnimal {
    public static void main(String[] args) {
        Tiburon t1 = new Tiburon("Herencia.Tiburon");
        Gato g1 = new Gato("Herencia.Gato");
        Perro per1 = new Perro("Herencia.Perro");
        PezPayaso pp1 = new PezPayaso("Herencia.Pez Payaso");

        g1.mamar();
        g1.moverse();
        g1.comunicarse();
        per1.mamar();
        per1.moverse();
        per1.comunicarse();
        t1.respirar();
        t1.moverse();
        t1.comunicarse();
        pp1.moverse();
        pp1.comunicarse();
        pp1.respirar();
    }
}
