package Herencia;

public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("Miauu");
    }
    public void jugarOvillo(){
        System.out.println("Juego con un ovillo");
    }
    public void mamar(){
        System.out.println("Mamo");
    }
    public void respirar(){
        System.out.println("Respiro");
    }
}
