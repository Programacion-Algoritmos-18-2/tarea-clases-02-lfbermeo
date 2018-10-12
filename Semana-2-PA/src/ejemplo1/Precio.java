package ejemplo1;

public class Precio {
    //Creamos una variable privada la cuál solo podremos hacer uso en este clase
    private double euros;
    //Creamos un metodo el cuál retorna un valor
    public double obtener() {
        return euros;
    }
    //Creamos un metodo el cuál envia un parametro
    public void agregar(double x) {
        //a la variable globla le asiganamos el valor que enviamos
        euros = x;
    }
}
