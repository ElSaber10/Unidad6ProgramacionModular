package src;
import java.util.Scanner;

public class Ejercicio8 {
String [] elementos = new String [5] ; 
String [] elementos2 = new String [5] ; 
    public Ejercicio8() {
       
         // 1,5,4,7,6,2,7,8,3,2,9,4,5,3,6,6,8,8,-50
        System.out.println("LLenar la 1");
        llenar(elementos);
        System.out.println("LLenar la 2");
        llenar(elementos2);
        System.out.println("Elementos 1");
        mostrar(elementos);
        System.out.println("Elementos 2");
        mostrar(elementos2);
        evaluar(elementos, elementos2);
    }
Scanner scan = new Scanner(System.in);
       int suma = 0;
    public void llenar(String valor []){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra " + i+ ") ");
            valor[i] = scan.nextLine();
         }
    }
    
    public void mostrar(String valor[]){
        for (int i = 0; i < 5; i++) {
            System.out.println(valor [i] + " " );
        }
    }
    public void evaluar(String valor[], String valor2[]){
        for (int i = 0; i < 5; i++) {
            if (valor[i].length() == valor2[i].length()){
                System.out.println("la posicion es " + i + " y tiene la misma cantidad");
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio8 n = new Ejercicio8();
    }
}
