package positivo_0;

import java.util.Scanner;



public class SignoNumero {
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
        if (numero < 0) {
            System.out.println(numero + " es menor que cero");
        }
        if (numero == 0) {
            System.out.println(numero + " es igual que cero");
        } 
    }

    public static void main(String args[]) {
        SignoNumero sign;
        sign = new SignoNumero();
        sign.ent();
        sign.evalSal();

    }

}
