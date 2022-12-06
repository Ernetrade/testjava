
public class Coche{
    //Atributos
    String color;
    int km;
    
    //Metodos
    public static void main(String[] args) {
        //Objeto
        Coche coche1 = new Coche();
        coche1.color = "blanco";
        coche1.km = 65;

        System.out.println("El color del coche es: " + coche1.color );
    }
}