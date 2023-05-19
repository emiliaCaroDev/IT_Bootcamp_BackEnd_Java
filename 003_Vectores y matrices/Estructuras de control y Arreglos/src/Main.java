import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] ciudades = new String[]{"Londres","Madrid","Nueva York","Buenos Aires","Asuncion","Sao Paulo","Lima","Santiago de Chile","Lisboa","Tokio"};

        Integer[][] temperaturas = new Integer[ciudades.length][2];
        int maxTemperatura = 0;
        int minTemperatura = 0;
        String ciudadMenorTemperatura = "";
        String ciudadMayorTemperatura = "";

        //llenar matriz
        for(int i=0;i<ciudades.length;i++){
            for(int j=0; j<2;j++){
                System.out.println("Ingrese temperatura de la ciudad "+ciudades[i]);
                Integer temperatura = Integer.parseInt(teclado.nextLine());
                temperaturas[i][j] = temperatura;
            }
        }

        //mostrar matriz
        /*for (int i=0;i<ciudades.length;i++){
            for(int j=0;j<2;j++){
                System.out.println("temperaturas["+i+"]["+j+"]= "+temperaturas[i][j]);
            }
        }*/

        //maximo elemento matriz
        for(int i=0;i<ciudades.length;i++){
            for(int j=0;j<2;j++){
                maxTemperatura = Math.max(temperaturas[i][j],maxTemperatura);
            }
        }

        //minimo elemento matriz
        for(int i=0;i<ciudades.length;i++){
            for(int j=0;j<2;j++){
                minTemperatura = Math.min(temperaturas[i][j],minTemperatura);
            }
        }

        //buscar ciudad con mayor y menor temperatura
        for(int i=0;i< ciudades.length;i++){
            for(int j=0;j<2;j++){
                if(minTemperatura == temperaturas[i][j]){
                    ciudadMenorTemperatura = ciudades[i];
                }
                if(maxTemperatura == temperaturas[i][j]){
                    ciudadMayorTemperatura = ciudades[i];
                }
            }
        }

        System.out.println("\nLa menor temperatura la tuvo "+ciudadMenorTemperatura+", con "+minTemperatura+" °C.");
        System.out.println("\nLa mayor temperatura la tuvo "+ciudadMayorTemperatura+", con "+maxTemperatura+" °C.");
    }
}