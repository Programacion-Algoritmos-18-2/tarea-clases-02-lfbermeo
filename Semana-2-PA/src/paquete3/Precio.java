package paquete3;

public class Precio {
    //Declaro la varibale privada que solo podremos hacer uso en la clase precio
    private double euros;
    //Creamos la función obtener que no retornará la variable global
    public double obtener() {
        return euros;
    }
    //Creamos el método agregar donde le asignamos a la variable global el nombre del parámetro que recibimos
    public void agregar(double x) {
        euros = x;
    }
    //Creamos un constrcutor el cuál no recibe ningún valor
    public Precio() {
        //AL método agregar le asiganmos un valor
        agregar(30.2);
    }
    //Creamos un constrcutor el cuál recibe un valor tipo doube 
    public Precio(double y){
        //Al método agregar le enviamos el valor de y
        agregar(y);
    }

}
