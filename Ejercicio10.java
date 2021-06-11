package src;

public class Ejercicio10 {
int [][] elementos = new int [4][3] ;
 
    public Ejercicio10() {
        llenar(elementos);
        mostrar(elementos);
        System.out.println("La suma es : "+suma);
    }

       int suma = 0;
    public void llenar(int valor [][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
            
            valor[i][j] = (int)(Math.random()*555+1);
                if (i % 2 == 0){
                    suma += valor[i][j]; 
                }
            }
         }
    }
    
    public void mostrar(int valor[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + valor[i][j]);
            }
            System.out.println();
         }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio10 n = new Ejercicio10();
    }
}
