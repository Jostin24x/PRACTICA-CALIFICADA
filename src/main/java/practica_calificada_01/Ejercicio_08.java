package practica_calificada_01;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author ACER
 */
public class Ejercicio_08 {
    public static void main(String args[]){
        Scanner Entrada = new Scanner (System.in);

        double a,b,c,d,e,f;
        
        System.out.println("Ingrese el precio de la Plancha:");
        a=Entrada.nextDouble();
        System.out.println("Ingrese el precio de la Licuadora:");
        b=Entrada.nextDouble();
        System.out.println("Ingrese el precio de la Lavadora:");
        c=Entrada.nextDouble();
        System.out.println("Ingrese el precio de la Cocina:");
        d=Entrada.nextDouble();
        double subTotal = a+b+c+d;
        System.out.println("El monto de los productos es:"+subTotal);
        
        if (subTotal>1200){
               DecimalFormat df = new DecimalFormat("#.00");
               double desc = subTotal * 0.17;
               e = desc;
               f = subTotal - e;
               System.out.println("El descuento es:"+df.format(e));
               System.out.println("El monto total a pagar es:"+f);
        }else{      
              System.out.println("No hay ningún descuento.");
              System.out.println("El monto a pagar sin descuento es:"+subTotal);
        }
 
    }
}
