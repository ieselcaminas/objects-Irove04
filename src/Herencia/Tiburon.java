package Herencia;

public class Tiburon extends Pez {
    public Tiburon(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("Arqueo el cuerpo para comunicarme");
    }
}
