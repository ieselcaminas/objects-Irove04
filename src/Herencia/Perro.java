package Herencia;

public class Perro extends Mamifero {
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("woof");
    }
    public void traerZapatilla(){
        System.out.println("Aqui te traigo las zapatillas");
    }
    public void mamar(){
        System.out.println("Mamo");
    }
    public void respirar(){
        System.out.println("Respiro");
    }
}
