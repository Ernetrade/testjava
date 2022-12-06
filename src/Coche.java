import javax.print.event.PrintEvent;

public class Coche{
    //Atributos
    int puertas = 4;
    
    //Metodos
    public static void main(String[] args) {
        
        int resultado = sum(5, 10, 14);
        System.out.println("El resultado es " + resultado);
       
       
        //Objeto
       Coche miCoche = new Coche();
       int p = suma(1) + miCoche.puertas;
       System.out.println("El coche tiene " + p + " puertas") ;
    }

    //Funciones
    public static int sum(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }

    public static int suma(int a){
        return a;
     }
}