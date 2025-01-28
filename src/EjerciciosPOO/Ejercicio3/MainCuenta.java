package EjerciciosPOO.Ejercicio3;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Cris",10);
        Cuenta c2 = new Cuenta("Manu",1100);
        Cuenta c3 = new Cuenta("Bob",200);


        c2.ingresar(100);

        c.retirar(100);

        c3.retirar(300);

        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
    }
}
