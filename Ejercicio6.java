 package src;

public class Ejercicio6 {
int [][] elementos = new int [][] {{5,6,13},{14,2,4},{21,7,6}} ; 
    public Ejercicio6() {
       
         // 1,5,4,7,6,2,7,8,3,2,9,4,5,3,6,6,8,8,-50
        mostrar(elementos);
        System.out.println("");
        multiplicar(elementos);
        System.out.println("");
        mostrar(elementos);
    }

       
    
    public void multiplicar(int [][] valor){
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor.length; j++) {
            valor[i][j] *= 2;
            }
         }
    }
    public void mostrar(int valor[][]){
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                System.out.print(" " + valor[i][j]);
            }
            System.out.println();
         }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio6 n = new Ejercicio6();
    }
}
