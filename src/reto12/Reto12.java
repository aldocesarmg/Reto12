
package reto12;

import java.util.Random;
import java.util.Scanner;

public class Reto12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroKm, nivelVidaCaballo = 0, nivelVidaUsuario = 0, kmRecorrido = 0, opcion = 0;
        System.out.println("Ingrese cantidad de km a recorrer:");
        numeroKm = sc.nextInt();
        System.out.println("Ingrese nivel de vida del caballo");
        nivelVidaCaballo = sc.nextInt();
        
        Random aleatorio = new Random(System.currentTimeMillis());
        for (int kmActual = 1; kmActual <= numeroKm; kmActual++) {
            System.out.println("El caballo está en el km " + kmActual);
            if (kmRecorrido == 5) {
                opcion = aleatorio.nextInt(4)+1;
                switch (opcion) {
                    case 1:
                        nivelVidaUsuario += 10;
                        System.out.println(" --- Encontramos un paquete de vida xD --- ");
                        System.out.println(" --- +10 puntos al usuario --------------- ");
                        
                        break;
                    case 2:
                        nivelVidaUsuario -= 5;
                        nivelVidaCaballo -= 5;
                        System.out.println(" --- Encontramos una bomba!! --- ");
                        System.out.println(" --- -5 puntos al caballo --- ");
                        System.out.println(" --- -5 puntos al usuario --- ");
                        break;
                    case 3:
                        nivelVidaCaballo += 10;
                        System.out.println(" --- Encontramos pasto! --- ");
                        System.out.println(" --- +10 puntos al caballo --- ");
                        break;
                    case 4:
                        nivelVidaCaballo -= 5;
                        System.out.println(" --- Encontramos una trampa! --- ");
                        System.out.println(" --- -5 puntos al caballo --- ");
                        break;
                    default:
                        throw new AssertionError();
                }
                kmRecorrido = 0;
            }else{
                opcion = aleatorio.nextInt(3)+1;
                if (opcion == 1) {
                    nivelVidaUsuario += 10;
                    System.out.println(" ----- Encontramos un paquete de vida xD ------ ");
                    System.out.println(" ----- +10 puntos al usuario ------------------ ");
                }else if(opcion == 2){
                    nivelVidaUsuario -= 5;
                    nivelVidaCaballo -= 5;
                    System.out.println(" ----- Encontramos una bomba!! ----- ");
                    System.out.println(" ----- -5 puntos al usuario -------- ");
                    System.out.println(" ----- -5 puntos al caballo -------- ");
                }
            }
            
            kmRecorrido++;
            
            if (nivelVidaUsuario == 0 || nivelVidaCaballo == 0) {
                System.out.println(" --- Se acabó el juego :( --- ");
                break;
            }
        }
    }
    
}
