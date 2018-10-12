package ejemplo1;

public class Principal {

    public static void main(String[] args) {
        //Creamos un objeto
        Precio p;
        p = new Precio();
        //al metodo agregar el asinamos un valor tipo doble
       p.agregar(20.2);
       //Imprimimos el método obtener
        System.out.println(p.obtener());
    }
}
