package practica_calificada_01;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ejercicio_09 {
    public static void main(String []args){
        Scanner dato = new Scanner(System.in);
        int c = 0; 
        int a; 
        float m =0;
        float mayor=0, menor=0;
        System.out.println("Ingres la cantidad de atletas");
        c = dato.nextInt(); 
        String atleta[] = new String[c];
        float tiempo[] = new float[c];
        for( a=0;a<c;a++){
            System.out.println("Ingres el nombre del atleta");
            atleta[a] = dato.next();
            System.out.println("Ingres el tiempo del recorrido");
            tiempo[a] = dato.nextFloat();
        }
        for (int i = 0; i < tiempo.length; i++) {
            if (mayor < tiempo[i]){
                mayor = tiempo[i];
            }
        }
        menor = mayor;
        for (int i = 0; i < tiempo.length; i++) {
            if (menor > tiempo[i]) {
                menor = tiempo[i];
            }
        }
        System.out.println("El ganador es el atleta con el tiempo "+menor);
    }
}
