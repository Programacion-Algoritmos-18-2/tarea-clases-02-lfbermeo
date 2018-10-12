package paquete3;

public class Principal {

    public static void main(String[] args) {
        //Creamos el objeto el cuál no le asigamos ningún valor 
        Precio p;
        p = new Precio();
        //Creamos el objeto 2 el cuál le asiganamos un valor que el contructor Precio le colocamos un valor
        Precio n = new Precio (25.9);
        
        //Imprimimos los valores que se le ah asignado
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }
}
