import javax.print.event.PrintEvent;

public class Coche{
    //Atributos
    int puertas = 4;
    
    //Metodos
    public static void main(String[] args) {
        //Objeto
        Coche miCoche = new Coche();
      

       int p = suma(1) + miCoche.puertas;
       System.out.println("El coche tiene " + p + " puertas") ;
    }

    //Funcion
    public static int suma(int a){
        return a;
     }
}