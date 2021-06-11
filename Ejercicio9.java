package src;
import java.util.Scanner;

public class Ejercicio9 {
int [][] elementos = new int [15][20] ; 
int [][] elementos2 = new int [15][20] ; 
 int [][] suma;
    public Ejercicio9() {
       
         // 1,5,4,7,6,2,7,8,3,2,9,4,5,3,6,6,8,8,-50
        System.out.println("LLenar la 1");
        llenar(elementos);
        System.out.println("LLenar la 2");
        llenar(elementos2);
        System.out.println("la primera y segunda");
        mostrar(elementos);
        System.out.println();
        mostrar(elementos2);
        System.out.println();
        mostrar(suma);
    }
Scanner scan = new Scanner(System.in);
    public void llenar(int valor [][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {  
            System.out.println("Numero " + i+ " " + j+ " ) ");
            valor[i][j] = scan.nextInt();
            }
        }
    }
    
    public void mostrar(int valor[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + valor[i][j]);
            }
            System.out.println();
         }
    }
    
     public void sumar(int [][] valor, int valor2[][]){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            suma[i][j] = valor[i][j] +valor2[i][j];
            }
         }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio9 n = new Ejercicio9();
    }
}


