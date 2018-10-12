package ejercicio2;

public class Principal {

    public static void main(String[] args) {
        //Creó el objeto a el cuál no le asignó ningún valor
        Equipo a = new Equipo();
        //imprimo tomando en cuenta la funcón de obtener tanto para nombre, jugadores y ciudad
        System.out.printf("Nombre %s - Jugadores %d - Ciudad %s\n", a.obtener_nombre(), a.obtener_jugadores(), a.obtener_ciudad());
        //Creó el objeto a el cuál le asigno el valor de nombre del equipo
        Equipo b = new Equipo("Rosas");
        //Agrego valores  para los jugadores y ciudades
        b.agregar_jugadores(26);
        b.agregar_ciudad("Guayaquil");
        //imprimo tomando en cuenta la funcón de obtener tanto para nombre, jugadores y ciudad
        System.out.printf("Nombre %s - Jugadores %d - Ciudad %s\n", b.obtener_nombre(), b.obtener_jugadores(), b.obtener_ciudad());
        //Creó el objeto a el cuál le asigno el valor de nombre del equipo y el numeros de jugadores
        Equipo c = new Equipo("Rojos", 24);
        //Agrego valor para que impirma la ciudad
        c.agregar_ciudad("Ambato");
        //imprimo tomando en cuenta la funcón de obtener tanto para nombre, jugadores y ciudad
        System.out.printf("Nombre %s - Jugadores %d - Ciudad %s\n", c.obtener_nombre(), c.obtener_jugadores(), c.obtener_ciudad());
        //Creó el objeto a el cuál le asigno el valor de nombre del equipo, el numeros de jugadores y la ciudad
        Equipo d = new Equipo("Rosados", 34, "Riobamba");
        //imprimo tomando en cuenta la funcón de obtener tanto para nombre, jugadores y ciudad
        System.out.printf("Nombre %s - Jugadores %d - Ciudad %s\n", d.obtener_nombre(), d.obtener_jugadores(), d.obtener_ciudad());
    }
}
