package ejercicio2;

public class Equipo {
    //Declaro las varibles privadas las cuales voy hacer uso
    private String nombre;
    private int num_jugadores;
    private String ciudad;
    //Creo las funciones para cada una de las variables
    public String obtener_nombre() {
        return nombre;
    }

    public int obtener_jugadores() {
        return num_jugadores;
    }

    public String obtener_ciudad() {
        return ciudad;
    }

    //Creo está función para que envie valores y le asigno a las variables globales el nombre de la variable que envio 
    public void agregar_nombre(String nom) {
        nombre = nom;
    }

    public void agregar_jugadores(int nun_juga) {
        num_jugadores = nun_juga;
    }

    public void agregar_ciudad(String ciu) {
        ciudad = ciu;
    }
    //Creó este constructor el cuál no envia valores y cuál le asignó valores por defecto
    public Equipo() {
        agregar_nombre("Rosales");
        agregar_jugadores(28);
        agregar_ciudad("loja");
    }
    //Creo este constructor el cuál envia un valor, el cuál ya fue asigando en el función agregar
    public Equipo(String nom) {
        agregar_nombre(nom);
    }
    //Creo este constructor el cuál envia dos valores, el cuál ya fue asigando en el función agregar
    public Equipo(String nom, int nun_juga) {
        agregar_nombre(nom);
        agregar_jugadores(nun_juga);
    }
    //Creo este constructor el cuál envia tres valores, el cuál ya fue asigando en el función agregar
    public Equipo(String nom, int num_juga, String ciudad) {
        agregar_nombre(nom);
        agregar_jugadores(num_juga);
        agregar_ciudad(ciudad);
    }
}
