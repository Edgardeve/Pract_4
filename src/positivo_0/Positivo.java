package positivo_0;
import java.util.Scanner;



public class Positivo {
    float numero;
    Scanner entrada = new Scanner(System.in);

    public void ent()
    {
        System.out.println("Introduzca un número real");
        numero = entrada.nextFloat();

    }
    
    public void evalSal()
    {
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero");
        }
    }
    public static void main(String[] args) {
        
        Positivo pos;
        pos = new Positivo();
        pos.ent();
        pos.evalSal();

    }

}
