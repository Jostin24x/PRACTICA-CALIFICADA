package practica_calificada_01;
/**
 *
 * @author ACER
 */
public class Ejercicio_01 {

    public static void main(String[] args) {
        
        String utiles []={"pelota", "zapatilla","mochila","polo"};
        double precios[]={35.5,89.60,45.99,25.70};
    
        System.out.println("Lista de Productos y sus precios");
        for (int u=0;u<utiles.length;u++){
            System.out.println(utiles[u]+ " "+ precios[u]);
        }
    }
}