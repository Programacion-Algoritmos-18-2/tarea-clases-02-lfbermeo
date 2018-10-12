package semana.pkg2.pa;

public class Principal {

    public static void main(String[] args) {
        //Creamos un objeto 
        Precio p;
        p = new Precio();
        System.out.println(p.euros);
        //A la variable le asiganmos un valor
        p.euros = 10.1;
        //Imprimimos
        System.out.println(p.euros);
    }
}
