package practica_calificada_01;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ejercicio_04 {
    public static void main(String[]args){
        Scanner dato = new Scanner(System.in);
        int mayor = 0; int menor = 0;
        int[] numeros = new int[11];
        for (int i = 0+1; i < 11; i++) {
            System.out.print("Ingrese el número " + (i) + " a evaluar :"); 
            numeros[i] = dato.nextInt();
        }
        for (int i = 1; i < numeros.length; i++) {
            if (mayor < numeros[i]){
            mayor = numeros[i];
            }
        }menor = mayor;
        for (int i = 1; i < numeros.length; i++) {
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es " +mayor+ " el numero menor es :" +menor); 
    }
} 

