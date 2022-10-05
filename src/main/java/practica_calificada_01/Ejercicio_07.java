package practica_calificada_01;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ejercicio_07 {
    public static void main(String args[]) {
        Scanner dato=new Scanner(System.in);
        float notas[]=new float[6]; int con=1;
        float promedio,sum=0;
        while(con<6) {
            System.out.println("Ingrese la " + con + "° nota : "); notas[con]=dato.nextFloat();
            sum = sum+notas[con]; con++;
        }
        promedio=sum/5;
        System.out.println("Su promedio es : " + promedio);
    } 
}
