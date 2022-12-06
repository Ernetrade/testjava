import javax.print.event.PrintEvent;

public class Coche{
    //Atributos
    /*String color;
    int km;*/
    int puertas;
    
    //Metodos
    public static void main(String[] args) {
        //Objeto
        Coche coche1 = new Coche();
        /*coche1.color = "blanco";
        coche1.km = 65;*/
        coche1.puertas = 4;

        //System.out.println("El color del coche es: " + coche1.color );
       int p = suma(1) + coche1.puertas;
       System.out.println("El coche tiene " + p + " puertas") ;
    }

    //Funcion
    public static int suma(int a){
        
        return a;
     }
}